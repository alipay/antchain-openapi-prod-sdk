<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class QueryUnionFormRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 发起方账户
    /**
     * @var string
     */
    public $userDid;

    // 联盟ID
    /**
     * @var int
     */
    public $unionId;

    // 业务单据ID
    /**
     * @var string
     */
    public $formId;

    // 业务单据类型
    /**
     * @var string
     */
    public $formType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'userDid'           => 'user_did',
        'unionId'           => 'union_id',
        'formId'            => 'form_id',
        'formType'          => 'form_type',
    ];

    public function validate()
    {
        Model::validateRequired('userDid', $this->userDid, true);
        Model::validateRequired('unionId', $this->unionId, true);
        Model::validateRequired('formId', $this->formId, true);
        Model::validateRequired('formType', $this->formType, true);
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
        if (null !== $this->formType) {
            $res['form_type'] = $this->formType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUnionFormRequest
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
        if (isset($map['form_type'])) {
            $model->formType = $map['form_type'];
        }

        return $model;
    }
}
