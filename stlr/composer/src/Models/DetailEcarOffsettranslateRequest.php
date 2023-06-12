<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class DetailEcarOffsettranslateRequest extends Model
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

    // 减碳数据转移记录业务方的业务单号
    /**
     * @var string
     */
    public $translationItemNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'translationItemNo' => 'translation_item_no',
    ];

    public function validate()
    {
        Model::validateRequired('translationItemNo', $this->translationItemNo, true);
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
        if (null !== $this->translationItemNo) {
            $res['translation_item_no'] = $this->translationItemNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailEcarOffsettranslateRequest
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
        if (isset($map['translation_item_no'])) {
            $model->translationItemNo = $map['translation_item_no'];
        }

        return $model;
    }
}
