/*! grafana - v4.2.0 - 2017-03-22
 * Copyright (c) 2017 Torkel Ödegaard; Licensed Apache-2.0 */

System.register(["bootstrap","vendor/filesaver","lodash-src","angular-strap","angular-route","angular-sanitize","angular-dragdrop","angular-bindonce","angular-ui","jquery","angular","app/core/config","lodash","moment","./core/core"],function(a,b){"use strict";var c,d,e,f,g,h,i;b&&b.id;return{setters:[function(a){},function(a){},function(a){},function(a){},function(a){},function(a){},function(a){},function(a){},function(a){},function(a){c=a},function(a){d=a},function(a){e=a},function(a){f=a},function(a){g=a},function(a){h=a}],execute:function(){i=function(){function a(){this.preBootModules=[],this.registerFunctions={},this.ngModuleDependencies=[]}return a.prototype.useModule=function(a){return this.preBootModules?this.preBootModules.push(a):f.default.extend(a,this.registerFunctions),this.ngModuleDependencies.push(a.name),a},a.prototype.init=function(){var a=this,b=d.default.module("grafana",[]);g.default.locale(e.default.bootData.user.locale),b.config(["$locationProvider","$controllerProvider","$compileProvider","$filterProvider","$httpProvider","$provide",function(b,c,d,f,g,h){d.preAssignBindingsEnabled(!0),"development"!==e.default.buildInfo.env&&d.debugInfoEnabled(!1),g.useApplyAsync(!0),a.registerFunctions.controller=c.register,a.registerFunctions.directive=d.directive,a.registerFunctions.factory=h.factory,a.registerFunctions.service=h.service,a.registerFunctions.filter=f.register,h.decorator("$http",["$delegate","$templateCache",function(a,b){var c=a.get;return a.get=function(a,d){return a.match(/\.html$/)&&(b.get(a)||(a+="?v="+(new Date).getTime())),c(a,d)},a}])}]),this.ngModuleDependencies=["grafana.core","ngRoute","ngSanitize","$strap.directives","ang-drag-drop","grafana","pasvaz.bindonce","ui.bootstrap","ui.bootstrap.tpls"];var i=["controllers","directives","factories","services","filters","routes"];f.default.each(i,function(b){var c="grafana."+b;a.useModule(d.default.module(c,[]))}),this.useModule(h.coreModule);var j=[System.import("app/features/all")];Promise.all(j).then(function(){c.default.fn.tooltip.defaults.animation=!1,d.default.bootstrap(document,a.ngModuleDependencies).invoke(function(){f.default.each(a.preBootModules,function(b){f.default.extend(b,a.registerFunctions)}),a.preBootModules=null})}).catch(function(a){console.log("Application boot failed:",a)})},a}(),a("GrafanaApp",i),a("default",new i)}}});