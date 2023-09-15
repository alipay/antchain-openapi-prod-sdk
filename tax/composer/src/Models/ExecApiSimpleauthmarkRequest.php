<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class ExecApiSimpleauthmarkRequest extends Model
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

    // 税号清单
    /**
     * @var IdentityInfo[]
     */
    public $identityIdList;

    // 租户号
    /**
     * @var string
     */
    public $instCode;

    // 请求id
    /**
     * @var string
     */
    public $bizUniqueId;

    // 产品类型
    /**
     * @var string
     */
    public $authType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'identityIdList'    => 'identity_id_list',
        'instCode'          => 'inst_code',
        'bizUniqueId'       => 'biz_unique_id',
        'authType'          => 'auth_type',
    ];

    public function validate()
    {
        Model::validateRequired('identityIdList', $this->identityIdList, true);
        Model::validateRequired('instCode', $this->instCode, true);
        Model::validateRequired('bizUniqueId', $this->bizUniqueId, true);
        Model::validateRequired('authType', $this->authType, true);
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
        if (null !== $this->identityIdList) {
            $res['identity_id_list'] = [];
            if (null !== $this->identityIdList && \is_array($this->identityIdList)) {
                $n = 0;
                foreach ($this->identityIdList as $item) {
                    $res['identity_id_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->instCode) {
            $res['inst_code'] = $this->instCode;
        }
        if (null !== $this->bizUniqueId) {
            $res['biz_unique_id'] = $this->bizUniqueId;
        }
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecApiSimpleauthmarkRequest
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
        if (isset($map['identity_id_list'])) {
            if (!empty($map['identity_id_list'])) {
                $model->identityIdList = [];
                $n                     = 0;
                foreach ($map['identity_id_list'] as $item) {
                    $model->identityIdList[$n++] = null !== $item ? IdentityInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['inst_code'])) {
            $model->instCode = $map['inst_code'];
        }
        if (isset($map['biz_unique_id'])) {
            $model->bizUniqueId = $map['biz_unique_id'];
        }
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }

        return $model;
    }
}
