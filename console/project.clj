;; Copyright © 2013, JUXT LTD. All Rights Reserved.
;;
;; The use and distribution terms for this software are covered by the
;; Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;; which can be found in the file epl-v10.html at the root of this distribution.
;;
;; By using this software in any fashion, you are agreeing to be bound by the
;; terms of this license.
;;
;; You must not remove this notice, or any other, from this software.

(load-file "project-header.clj")

(defproject console (get-version)
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 ;; Hiccup
                 [hiccup "1.0.4"]
                 ;; CSS for examples
                 [garden "0.1.0-beta6"]
                 ;; Stencil for templating
                 [stencil "0.3.2"]
                 ;; Markdown
                 [endophile "0.1.0"]
                 ;; Liberator for REST services
                 [liberator "0.9.0"]
                 ;; Codox for documentation
                 [codox/codox.core "0.6.6"]
                 ]
  :source-paths ["src" "../extensions/stencil/src"]
  )
