<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class AuthLeagueApplyRequest extends Model
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

    // 申请Id
    /**
     * @var string
     */
    public $applyId;

    // 申请类型【NONE,JOIN,CREATE,ALL】
    /**
     * @var string
     */
    public $applyType;

    // 备注
    /**
     * @var string
     */
    public $comment;

    // 审核结果
    /**
     * @var bool
     */
    public $pass;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'applyId'           => 'apply_id',
        'applyType'         => 'apply_type',
        'comment'           => 'comment',
        'pass'              => 'pass',
    ];

    public function validate()
    {
        Model::validateRequired('applyId', $this->applyId, true);
        Model::validateRequired('applyType', $this->applyType, true);
        Model::validateRequired('pass', $this->pass, true);
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
        if (null !== $this->applyId) {
            $res['apply_id'] = $this->applyId;
        }
        if (null !== $this->applyType) {
            $res['apply_type'] = $this->applyType;
        }
        if (null !== $this->comment) {
            $res['comment'] = $this->comment;
        }
        if (null !== $this->pass) {
            $res['pass'] = $this->pass;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthLeagueApplyRequest
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
        if (isset($map['apply_id'])) {
            $model->applyId = $map['apply_id'];
        }
        if (isset($map['apply_type'])) {
            $model->applyType = $map['apply_type'];
        }
        if (isset($map['comment'])) {
            $model->comment = $map['comment'];
        }
        if (isset($map['pass'])) {
            $model->pass = $map['pass'];
        }

        return $model;
    }
}
