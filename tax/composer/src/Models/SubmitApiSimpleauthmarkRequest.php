<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class SubmitApiSimpleauthmarkRequest extends Model
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

    // 打标之后的结果
    /**
     * @var IdentityIdGroup[]
     */
    public $identityGroupList;

    // 产品类型
    /**
     * @var string
     */
    public $authType;

    // 租户信息
    /**
     * @var string
     */
    public $instCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'identityGroupList' => 'identity_group_list',
        'authType'          => 'auth_type',
        'instCode'          => 'inst_code',
    ];

    public function validate()
    {
        Model::validateRequired('identityGroupList', $this->identityGroupList, true);
        Model::validateRequired('instCode', $this->instCode, true);
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
        if (null !== $this->identityGroupList) {
            $res['identity_group_list'] = [];
            if (null !== $this->identityGroupList && \is_array($this->identityGroupList)) {
                $n = 0;
                foreach ($this->identityGroupList as $item) {
                    $res['identity_group_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->instCode) {
            $res['inst_code'] = $this->instCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitApiSimpleauthmarkRequest
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
        if (isset($map['identity_group_list'])) {
            if (!empty($map['identity_group_list'])) {
                $model->identityGroupList = [];
                $n                        = 0;
                foreach ($map['identity_group_list'] as $item) {
                    $model->identityGroupList[$n++] = null !== $item ? IdentityIdGroup::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }
        if (isset($map['inst_code'])) {
            $model->instCode = $map['inst_code'];
        }

        return $model;
    }
}
