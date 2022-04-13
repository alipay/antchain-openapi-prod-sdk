// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // Specification of the desired behavior of the pod. 
    public class PodSpec : TeaModel {
        // Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers
        [NameInMap("active_deadline_seconds")]
        [Validation(Required=false)]
        public long? ActiveDeadlineSeconds { get; set; }

        // If specified, the pod_s scheduling constraints
        // 
        [NameInMap("affinity")]
        [Validation(Required=false)]
        public Affinity Affinity { get; set; }

        // AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.
        // 
        [NameInMap("automount_service_account_token")]
        [Validation(Required=false)]
        public bool? AutomountServiceAccountToken { get; set; }

        // List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated.
        // 
        [NameInMap("containers")]
        [Validation(Required=true)]
        public List<ContainerSpec> Containers { get; set; }

        // Specifies the DNS parameters of a pod. Parameters specified here will be merged to the generated DNS configuration based on DNSPolicy.
        [NameInMap("dns_config")]
        [Validation(Required=false)]
        public PodDNSConfig DnsConfig { get; set; }

        // Set DNS policy for the pod. Defaults to "ClusterFirst". Valid values are _ClusterFirstWithHostNet_, _ClusterFirst_, _Default_ or _None_. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to _ClusterFirstWithHostNet_.
        [NameInMap("dns_policy")]
        [Validation(Required=false)]
        public string DnsPolicy { get; set; }

        // EnableServiceLinks indicates whether information about services should be injected into pod_s environment variables, matching the syntax of Docker links. Optional: Defaults to true.
        // 
        [NameInMap("enable_service_links")]
        [Validation(Required=false)]
        public bool? EnableServiceLinks { get; set; }

        // HostAliases is an optional list of hosts and IPs that will be injected into the pod_s hosts file if specified. This is only valid for non-hostNetwork pods.
        [NameInMap("host_aliases")]
        [Validation(Required=false)]
        public HostAlias HostAliases { get; set; }

        // Use the host_s ipc namespace. Optional: Default to false.
        // 
        [NameInMap("host_ipc")]
        [Validation(Required=false)]
        public bool? HostIpc { get; set; }

        // Host networking requested for this pod. Use the host_s network namespace. If this option is set, the ports that will be used must be specified. Default to false.
        // 
        [NameInMap("host_network")]
        [Validation(Required=false)]
        public bool? HostNetwork { get; set; }

        // Use the host_s pid namespace. Optional: Default to false.
        // 
        [NameInMap("host_pid")]
        [Validation(Required=false)]
        public bool? HostPid { get; set; }

        // Specifies the hostname of the Pod If not specified, the pod_s hostname will be set to a system-defined value.
        // 
        [NameInMap("hostname")]
        [Validation(Required=false)]
        public string Hostname { get; set; }

        // ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec
        [NameInMap("image_pull_secrets")]
        [Validation(Required=false)]
        public List<string> ImagePullSecrets { get; set; }

        // List of initialization containers belonging to the pod
        [NameInMap("init_containers")]
        [Validation(Required=false)]
        public List<ContainerSpec> InitContainers { get; set; }

        // NodeName is a request to schedule this pod onto a specific node. 
        [NameInMap("node_name")]
        [Validation(Required=false)]
        public string NodeName { get; set; }

        // NodeSelector is a selector which must be true for the pod to fit on a node
        [NameInMap("node_selector")]
        [Validation(Required=false)]
        public List<PodNodeSelector> NodeSelector { get; set; }

        // The priority value. Various system components use this field to find the priority of the pod.
        [NameInMap("priority")]
        [Validation(Required=false)]
        public long? Priority { get; set; }

        // If specified, indicates the pod_s priority. "system-node-critical" and "system-cluster-critical" are two special keywords which indicate the highest priorities with the former being the highest priority
        [NameInMap("priority_class_name")]
        [Validation(Required=false)]
        public string PriorityClassName { get; set; }

        // If specified, all readiness gates will be evaluated for pod readiness
        [NameInMap("readiness_gates")]
        [Validation(Required=false)]
        public PodReadinessGate ReadinessGates { get; set; }

        // Restart policy for all containers within the pod
        [NameInMap("restart_policy")]
        [Validation(Required=false)]
        public string RestartPolicy { get; set; }

        // ServiceAccountName is the name of the ServiceAccount to use to run this pod
        [NameInMap("service_account_name")]
        [Validation(Required=false)]
        public string ServiceAccountName { get; set; }

        // If specified, the pod_s tolerations.
        // 
        [NameInMap("tolerations")]
        [Validation(Required=false)]
        public List<Toleration> Tolerations { get; set; }

        // List of volumes that can be mounted by containers belonging to the pod
        [NameInMap("volumes")]
        [Validation(Required=false)]
        public List<Volume> Volumes { get; set; }

    }

}
