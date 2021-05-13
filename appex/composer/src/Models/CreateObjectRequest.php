<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class CreateObjectRequest extends Model
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

    // 区块链身份
    //
    //
    /**
     * @var string
     */
    public $userDid;

    // 联盟标识（联盟码）
    /**
     * @var string
     */
    public $unionId;

    // 归属权要流转的表单ID
    //
    //
    /**
     * @var string
     */
    public $formId;

    // 物的信息
    //
    //
    /**
     * @var string
     */
    public $formBody;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'userDid'           => 'user_did',
        'unionId'           => 'union_id',
        'formId'            => 'form_id',
        'formBody'          => 'form_body',
    ];

    public function validate()
    {
        Model::validateRequired('userDid', $this->userDid, true);
        Model::validateRequired('unionId', $this->unionId, true);
        Model::validateRequired('formId', $this->formId, true);
        Model::validateRequired('formBody', $this->formBody, true);
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
        if (null !== $this->userDid) {
            $res['user_did'] = $this->userDid;
        }
        if (null !== $this->unionId) {
            $res['union_id'] = $this->unionId;
        }
        if (null !== $this->formId) {
            $res['form_id'] = $this->formId;
        }
        if (null !== $this->formBody) {
            $res['form_body'] = $this->formBody;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateObjectRequest
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
        if (isset($map['user_did'])) {
            $model->userDid = $map['user_did'];
        }
        if (isset($map['union_id'])) {
            $model->unionId = $map['union_id'];
        }
        if (isset($map['form_id'])) {
            $model->formId = $map['form_id'];
        }
        if (isset($map['form_body'])) {
            $model->formBody = $map['form_body'];
        }

        return $model;
    }
}
