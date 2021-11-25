<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class AddContractDocumentRequest extends Model
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

    // 待签署文件
    /**
     * @var ContractDocument[]
     */
    public $docs;

    // 流程ID
    /**
     * @var string
     */
    public $flowId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'docs'              => 'docs',
        'flowId'            => 'flow_id',
    ];

    public function validate()
    {
        Model::validateRequired('docs', $this->docs, true);
        Model::validateRequired('flowId', $this->flowId, true);
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
        if (null !== $this->docs) {
            $res['docs'] = [];
            if (null !== $this->docs && \is_array($this->docs)) {
                $n = 0;
                foreach ($this->docs as $item) {
                    $res['docs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddContractDocumentRequest
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
        if (isset($map['docs'])) {
            if (!empty($map['docs'])) {
                $model->docs = [];
                $n           = 0;
                foreach ($map['docs'] as $item) {
                    $model->docs[$n++] = null !== $item ? ContractDocument::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }

        return $model;
    }
}
