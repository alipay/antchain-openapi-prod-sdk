<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QuerySidecaropsAllservicesResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 根据wsglabel换到的wsgname
    /**
     * @var string
     */
    public $workspaceGroupName;

    // 所属命名空间
    /**
     * @var string
     */
    public $namespace;

    // 应用服务详细配置信息，主要为sidecar当前在用的参数信息
    /**
     * @var AppServiceSidecarReleaseInfo[]
     */
    public $servicesSidecarInfo;

    // 不满足升级条件的服务信息，包含服务不唯一应用及正在升级的应用。
    /**
     * @var AppServiceSidecarReleaseInfo[]
     */
    public $unsatisfiedServicesInfo;
    protected $_name = [
        'reqMsgId'                => 'req_msg_id',
        'resultCode'              => 'result_code',
        'resultMsg'               => 'result_msg',
        'workspaceGroupName'      => 'workspace_group_name',
        'namespace'               => 'namespace',
        'servicesSidecarInfo'     => 'services_sidecar_info',
        'unsatisfiedServicesInfo' => 'unsatisfied_services_info',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->workspaceGroupName) {
            $res['workspace_group_name'] = $this->workspaceGroupName;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->servicesSidecarInfo) {
            $res['services_sidecar_info'] = [];
            if (null !== $this->servicesSidecarInfo && \is_array($this->servicesSidecarInfo)) {
                $n = 0;
                foreach ($this->servicesSidecarInfo as $item) {
                    $res['services_sidecar_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->unsatisfiedServicesInfo) {
            $res['unsatisfied_services_info'] = [];
            if (null !== $this->unsatisfiedServicesInfo && \is_array($this->unsatisfiedServicesInfo)) {
                $n = 0;
                foreach ($this->unsatisfiedServicesInfo as $item) {
                    $res['unsatisfied_services_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySidecaropsAllservicesResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['workspace_group_name'])) {
            $model->workspaceGroupName = $map['workspace_group_name'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['services_sidecar_info'])) {
            if (!empty($map['services_sidecar_info'])) {
                $model->servicesSidecarInfo = [];
                $n                          = 0;
                foreach ($map['services_sidecar_info'] as $item) {
                    $model->servicesSidecarInfo[$n++] = null !== $item ? AppServiceSidecarReleaseInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['unsatisfied_services_info'])) {
            if (!empty($map['unsatisfied_services_info'])) {
                $model->unsatisfiedServicesInfo = [];
                $n                              = 0;
                foreach ($map['unsatisfied_services_info'] as $item) {
                    $model->unsatisfiedServicesInfo[$n++] = null !== $item ? AppServiceSidecarReleaseInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
