<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class GetUnireleasePipelineResponse extends Model
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

    // pipeline ID
    /**
     * @var string
     */
    public $id;

    // 解决方案ID
    /**
     * @var string
     */
    public $solutionId;

    // 发布单状态
    /**
     * @var string
     */
    public $state;

    // 应用发布状态
    /**
     * @var TenantAppReleasePipeline[]
     */
    public $tenantPipelines;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'id'              => 'id',
        'solutionId'      => 'solution_id',
        'state'           => 'state',
        'tenantPipelines' => 'tenant_pipelines',
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->solutionId) {
            $res['solution_id'] = $this->solutionId;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->tenantPipelines) {
            $res['tenant_pipelines'] = [];
            if (null !== $this->tenantPipelines && \is_array($this->tenantPipelines)) {
                $n = 0;
                foreach ($this->tenantPipelines as $item) {
                    $res['tenant_pipelines'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetUnireleasePipelineResponse
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['solution_id'])) {
            $model->solutionId = $map['solution_id'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['tenant_pipelines'])) {
            if (!empty($map['tenant_pipelines'])) {
                $model->tenantPipelines = [];
                $n                      = 0;
                foreach ($map['tenant_pipelines'] as $item) {
                    $model->tenantPipelines[$n++] = null !== $item ? TenantAppReleasePipeline::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
