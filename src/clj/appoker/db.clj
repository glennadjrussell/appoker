(ns appoker.db)

(defn applications
  "Returns a sequence of applications that are currently deployed"
  ["forge"])

;;
;; /v4/environments
;;
;; [
;;   { "name": "provision" },
;;   { "name": "forge" },
;;   { "name": "production"}
;; ]
;;
(defn environments
  "Retrieve currently configured environments from puppetdb"
  []
  ["provision" "forge" "production"])

(defn nodes
  "Given an environment, retrieve all it's nodes"
  [env]
  ["node1.vm" "node2.vm" "node3.vm"])

(defn resources
  "Given a node, get all it's resources"
  ["postgres" "ntp" "sshd"])
