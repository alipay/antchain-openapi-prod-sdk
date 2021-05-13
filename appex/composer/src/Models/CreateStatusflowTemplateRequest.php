<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class CreateStatusflowTemplateRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 联盟ID
    /**
     * @var string
     */
    public $unionId;

    // 状态流模版名称
    /**
     * @var string
     */
    public $flowName;

    // 自定义流程入参DTO
    /**
     * @var FlowTemplate[]
     */
    public $flowTemplate;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'unionId'           => 'union_id',
        'flowName'          => 'flow_name',
        'flowTemplate'      => 'flow_template',
    ];

    public function validate()
    {
        Model::validateRequired('unionId', $this->unionId, true);
        Model::validateRequired('flowName', $this->flowName, true);
        Model::validateRequired('flowTemplate', $this->flowTemplate, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->unionId) {
            $res['union_id'] = $this->unionId;
        }
        if (null !== $this->flowName) {
            $res['flow_name'] = $this->flowName;
        }
        if (null !== $this->flowTemplate) {
            $res['flow_template'] = [];
            if (null !== $this->flowTemplate && \is_array($this->flowTemplate)) {
                $n = 0;
                foreach ($this->flowTemplate as $item) {
                    $res['flow_template'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateStatusflowTemplateRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['union_id'])) {
            $model->unionId = $map['union_id'];
        }
        if (isset($map['flow_name'])) {
            $model->flowName = $map['flow_name'];
        }
        if (isset($map['flow_template'])) {
            if (!empty($map['flow_template'])) {
                $model->flowTemplate = [];
                $n                   = 0;
                foreach ($map['flow_template'] as $item) {
                    $model->flowTemplate[$n++] = null !== $item ? FlowTemplate::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
