<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class PodSpec extends Model
{
    // Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers
    /**
     * @example
     *
     * @var int
     */
    public $activeDeadlineSeconds;

    // If specified, the pod_s scheduling constraints
    //
    /**
     * @example
     *
     * @var Affinity
     */
    public $affinity;

    // AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.
    //
    /**
     * @example true, false
     *
     * @var bool
     */
    public $automountServiceAccountToken;

    // List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated.
    //
    /**
     * @example
     *
     * @var ContainerSpec[]
     */
    public $containers;

    // Specifies the DNS parameters of a pod. Parameters specified here will be merged to the generated DNS configuration based on DNSPolicy.
    /**
     * @example
     *
     * @var PodDNSConfig
     */
    public $dnsConfig;

    // Set DNS policy for the pod. Defaults to "ClusterFirst". Valid values are _ClusterFirstWithHostNet_, _ClusterFirst_, _Default_ or _None_. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to _ClusterFirstWithHostNet_.
    /**
     * @example ClusterFirstWithHostNet_, _ClusterFirst_,
     *
     * @var string
     */
    public $dnsPolicy;

    // EnableServiceLinks indicates whether information about services should be injected into pod_s environment variables, matching the syntax of Docker links. Optional: Defaults to true.
    //
    /**
     * @example true, false
     *
     * @var bool
     */
    public $enableServiceLinks;

    // HostAliases is an optional list of hosts and IPs that will be injected into the pod_s hosts file if specified. This is only valid for non-hostNetwork pods.
    /**
     * @example
     *
     * @var HostAlias
     */
    public $hostAliases;

    // Use the host_s ipc namespace. Optional: Default to false.
    //
    /**
     * @example true, false
     *
     * @var bool
     */
    public $hostIpc;

    // Host networking requested for this pod. Use the host_s network namespace. If this option is set, the ports that will be used must be specified. Default to false.
    //
    /**
     * @example true, false
     *
     * @var bool
     */
    public $hostNetwork;

    // Use the host_s pid namespace. Optional: Default to false.
    //
    /**
     * @example true, false
     *
     * @var bool
     */
    public $hostPid;

    // Specifies the hostname of the Pod If not specified, the pod_s hostname will be set to a system-defined value.
    //
    /**
     * @example hostname
     *
     * @var string
     */
    public $hostname;

    // ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec
    /**
     * @example
     *
     * @var string[]
     */
    public $imagePullSecrets;

    // List of initialization containers belonging to the pod
    /**
     * @example
     *
     * @var ContainerSpec[]
     */
    public $initContainers;

    // NodeName is a request to schedule this pod onto a specific node.
    /**
     * @example nodename
     *
     * @var string
     */
    public $nodeName;

    // NodeSelector is a selector which must be true for the pod to fit on a node
    /**
     * @example
     *
     * @var PodNodeSelector[]
     */
    public $nodeSelector;

    // The priority value. Various system components use this field to find the priority of the pod.
    /**
     * @example
     *
     * @var int
     */
    public $priority;

    // If specified, indicates the pod_s priority. "system-node-critical" and "system-cluster-critical" are two special keywords which indicate the highest priorities with the former being the highest priority
    /**
     * @example system-node-critical", "system-cluster-critical"
     *
     * @var string
     */
    public $priorityClassName;

    // If specified, all readiness gates will be evaluated for pod readiness
    /**
     * @example
     *
     * @var PodReadinessGate
     */
    public $readinessGates;

    // Restart policy for all containers within the pod
    /**
     * @example Always, OnFailure, Never
     *
     * @var string
     */
    public $restartPolicy;

    // ServiceAccountName is the name of the ServiceAccount to use to run this pod
    /**
     * @example default-service-account
     *
     * @var string
     */
    public $serviceAccountName;

    // If specified, the pod_s tolerations.
    //
    /**
     * @example
     *
     * @var Toleration[]
     */
    public $tolerations;

    // List of volumes that can be mounted by containers belonging to the pod
    /**
     * @example
     *
     * @var Volume[]
     */
    public $volumes;
    protected $_name = [
        'activeDeadlineSeconds'        => 'active_deadline_seconds',
        'affinity'                     => 'affinity',
        'automountServiceAccountToken' => 'automount_service_account_token',
        'containers'                   => 'containers',
        'dnsConfig'                    => 'dns_config',
        'dnsPolicy'                    => 'dns_policy',
        'enableServiceLinks'           => 'enable_service_links',
        'hostAliases'                  => 'host_aliases',
        'hostIpc'                      => 'host_ipc',
        'hostNetwork'                  => 'host_network',
        'hostPid'                      => 'host_pid',
        'hostname'                     => 'hostname',
        'imagePullSecrets'             => 'image_pull_secrets',
        'initContainers'               => 'init_containers',
        'nodeName'                     => 'node_name',
        'nodeSelector'                 => 'node_selector',
        'priority'                     => 'priority',
        'priorityClassName'            => 'priority_class_name',
        'readinessGates'               => 'readiness_gates',
        'restartPolicy'                => 'restart_policy',
        'serviceAccountName'           => 'service_account_name',
        'tolerations'                  => 'tolerations',
        'volumes'                      => 'volumes',
    ];

    public function validate()
    {
        Model::validateRequired('containers', $this->containers, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->activeDeadlineSeconds) {
            $res['active_deadline_seconds'] = $this->activeDeadlineSeconds;
        }
        if (null !== $this->affinity) {
            $res['affinity'] = null !== $this->affinity ? $this->affinity->toMap() : null;
        }
        if (null !== $this->automountServiceAccountToken) {
            $res['automount_service_account_token'] = $this->automountServiceAccountToken;
        }
        if (null !== $this->containers) {
            $res['containers'] = [];
            if (null !== $this->containers && \is_array($this->containers)) {
                $n = 0;
                foreach ($this->containers as $item) {
                    $res['containers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->dnsConfig) {
            $res['dns_config'] = null !== $this->dnsConfig ? $this->dnsConfig->toMap() : null;
        }
        if (null !== $this->dnsPolicy) {
            $res['dns_policy'] = $this->dnsPolicy;
        }
        if (null !== $this->enableServiceLinks) {
            $res['enable_service_links'] = $this->enableServiceLinks;
        }
        if (null !== $this->hostAliases) {
            $res['host_aliases'] = null !== $this->hostAliases ? $this->hostAliases->toMap() : null;
        }
        if (null !== $this->hostIpc) {
            $res['host_ipc'] = $this->hostIpc;
        }
        if (null !== $this->hostNetwork) {
            $res['host_network'] = $this->hostNetwork;
        }
        if (null !== $this->hostPid) {
            $res['host_pid'] = $this->hostPid;
        }
        if (null !== $this->hostname) {
            $res['hostname'] = $this->hostname;
        }
        if (null !== $this->imagePullSecrets) {
            $res['image_pull_secrets'] = $this->imagePullSecrets;
        }
        if (null !== $this->initContainers) {
            $res['init_containers'] = [];
            if (null !== $this->initContainers && \is_array($this->initContainers)) {
                $n = 0;
                foreach ($this->initContainers as $item) {
                    $res['init_containers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->nodeName) {
            $res['node_name'] = $this->nodeName;
        }
        if (null !== $this->nodeSelector) {
            $res['node_selector'] = [];
            if (null !== $this->nodeSelector && \is_array($this->nodeSelector)) {
                $n = 0;
                foreach ($this->nodeSelector as $item) {
                    $res['node_selector'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->priority) {
            $res['priority'] = $this->priority;
        }
        if (null !== $this->priorityClassName) {
            $res['priority_class_name'] = $this->priorityClassName;
        }
        if (null !== $this->readinessGates) {
            $res['readiness_gates'] = null !== $this->readinessGates ? $this->readinessGates->toMap() : null;
        }
        if (null !== $this->restartPolicy) {
            $res['restart_policy'] = $this->restartPolicy;
        }
        if (null !== $this->serviceAccountName) {
            $res['service_account_name'] = $this->serviceAccountName;
        }
        if (null !== $this->tolerations) {
            $res['tolerations'] = [];
            if (null !== $this->tolerations && \is_array($this->tolerations)) {
                $n = 0;
                foreach ($this->tolerations as $item) {
                    $res['tolerations'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->volumes) {
            $res['volumes'] = [];
            if (null !== $this->volumes && \is_array($this->volumes)) {
                $n = 0;
                foreach ($this->volumes as $item) {
                    $res['volumes'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PodSpec
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['active_deadline_seconds'])) {
            $model->activeDeadlineSeconds = $map['active_deadline_seconds'];
        }
        if (isset($map['affinity'])) {
            $model->affinity = Affinity::fromMap($map['affinity']);
        }
        if (isset($map['automount_service_account_token'])) {
            $model->automountServiceAccountToken = $map['automount_service_account_token'];
        }
        if (isset($map['containers'])) {
            if (!empty($map['containers'])) {
                $model->containers = [];
                $n                 = 0;
                foreach ($map['containers'] as $item) {
                    $model->containers[$n++] = null !== $item ? ContainerSpec::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['dns_config'])) {
            $model->dnsConfig = PodDNSConfig::fromMap($map['dns_config']);
        }
        if (isset($map['dns_policy'])) {
            $model->dnsPolicy = $map['dns_policy'];
        }
        if (isset($map['enable_service_links'])) {
            $model->enableServiceLinks = $map['enable_service_links'];
        }
        if (isset($map['host_aliases'])) {
            $model->hostAliases = HostAlias::fromMap($map['host_aliases']);
        }
        if (isset($map['host_ipc'])) {
            $model->hostIpc = $map['host_ipc'];
        }
        if (isset($map['host_network'])) {
            $model->hostNetwork = $map['host_network'];
        }
        if (isset($map['host_pid'])) {
            $model->hostPid = $map['host_pid'];
        }
        if (isset($map['hostname'])) {
            $model->hostname = $map['hostname'];
        }
        if (isset($map['image_pull_secrets'])) {
            if (!empty($map['image_pull_secrets'])) {
                $model->imagePullSecrets = $map['image_pull_secrets'];
            }
        }
        if (isset($map['init_containers'])) {
            if (!empty($map['init_containers'])) {
                $model->initContainers = [];
                $n                     = 0;
                foreach ($map['init_containers'] as $item) {
                    $model->initContainers[$n++] = null !== $item ? ContainerSpec::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['node_name'])) {
            $model->nodeName = $map['node_name'];
        }
        if (isset($map['node_selector'])) {
            if (!empty($map['node_selector'])) {
                $model->nodeSelector = [];
                $n                   = 0;
                foreach ($map['node_selector'] as $item) {
                    $model->nodeSelector[$n++] = null !== $item ? PodNodeSelector::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['priority'])) {
            $model->priority = $map['priority'];
        }
        if (isset($map['priority_class_name'])) {
            $model->priorityClassName = $map['priority_class_name'];
        }
        if (isset($map['readiness_gates'])) {
            $model->readinessGates = PodReadinessGate::fromMap($map['readiness_gates']);
        }
        if (isset($map['restart_policy'])) {
            $model->restartPolicy = $map['restart_policy'];
        }
        if (isset($map['service_account_name'])) {
            $model->serviceAccountName = $map['service_account_name'];
        }
        if (isset($map['tolerations'])) {
            if (!empty($map['tolerations'])) {
                $model->tolerations = [];
                $n                  = 0;
                foreach ($map['tolerations'] as $item) {
                    $model->tolerations[$n++] = null !== $item ? Toleration::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['volumes'])) {
            if (!empty($map['volumes'])) {
                $model->volumes = [];
                $n              = 0;
                foreach ($map['volumes'] as $item) {
                    $model->volumes[$n++] = null !== $item ? Volume::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
