<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYCHARITY\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateCombinationRequest extends Model
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

    // 分期id
    /**
     * @var string
     */
    public $stagesId;

    // 实施内容信息集合
    /**
     * @var SubjectCombinationMessage[]
     */
    public $combinationMessageList;
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'stagesId'               => 'stages_id',
        'combinationMessageList' => 'combination_message_list',
    ];

    public function validate()
    {
        Model::validateRequired('stagesId', $this->stagesId, true);
        Model::validateRequired('combinationMessageList', $this->combinationMessageList, true);
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
        if (null !== $this->stagesId) {
            $res['stages_id'] = $this->stagesId;
        }
        if (null !== $this->combinationMessageList) {
            $res['combination_message_list'] = [];
            if (null !== $this->combinationMessageList && \is_array($this->combinationMessageList)) {
                $n = 0;
                foreach ($this->combinationMessageList as $item) {
                    $res['combination_message_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateCombinationRequest
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
        if (isset($map['stages_id'])) {
            $model->stagesId = $map['stages_id'];
        }
        if (isset($map['combination_message_list'])) {
            if (!empty($map['combination_message_list'])) {
                $model->combinationMessageList = [];
                $n                             = 0;
                foreach ($map['combination_message_list'] as $item) {
                    $model->combinationMessageList[$n++] = null !== $item ? SubjectCombinationMessage::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
