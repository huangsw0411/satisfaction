/*
Template Name: Material Admin
Author: Wrappixel
Email: niravjoshi87@gmail.com
File: js
*/
$(function() {
  'use strict';
  // ==============================================================
  // Last month earning
  // ==============================================================
  var sparklineLogin = function() {


  };
  var sparkResize;

  $(window).resize(function(e) {
    clearTimeout(sparkResize);
    sparkResize = setTimeout(sparklineLogin, 500);
  });
  sparklineLogin();

  // ==============================================================
  // Our Visitor
  // ==============================================================

  var chart = c3.generate({
    bindto: '#visitor',
    data: {
      columns: [['Iphone', 60], ['Samsung', 12], ['One+', 28]],

      type: 'donut',
      onclick: function(d, i) {
        console.log('onclick', d, i);
      },
      onmouseover: function(d, i) {
        console.log('onmouseover', d, i);
      },
      onmouseout: function(d, i) {
        console.log('onmouseout', d, i);
      }
    },
    donut: {
      label: {
        show: false
      },
      title: 'Sales',
      width: 20
    },

    legend: {
      hide: true
      //or hide: 'data1'
      //or hide: ['data1', 'data2']
    },
    color: {
      pattern: ['#4798e8', '#01c0c8', '#f6f6f6']
    }
  });
  // ==============================================================
  // Sales income
  // ==============================================================

});
