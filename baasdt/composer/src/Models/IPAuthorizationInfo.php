<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPAuthorizationInfo extends Model
{
    // 授权模式,0普通授权/1独家授权
    /**
     * @example 0
     *
     * @var int[]
     */
    public $authorizationModel;

    // 授权类型，衍生品授权，营销授权，商标授权，数字虚拟授权，其他
    /**
     * @example 衍生品授权
     *
     * @var string[]
     */
    public $authorizationType;

    // 授权范围
    /**
     * @example 服装行业、电器行业
     *
     * @var string
     */
    public $authorizationScope;

    // 授权要求
    /**
     * @example 合作商家必须拥有XX资质
     *
     * @var string
     */
    public $authorizationRequirement;
    protected $_name = [
        'authorizationModel'       => 'authorization_model',
        'authorizationType'        => 'authorization_type',
        'authorizationScope'       => 'authorization_scope',
        'authorizationRequirement' => 'authorization_requirement',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authorizationModel) {
            $res['authorization_model'] = $this->authorizationModel;
        }
        if (null !== $this->authorizationType) {
            $res['authorization_type'] = $this->authorizationType;
        }
        if (null !== $this->authorizationScope) {
            $res['authorization_scope'] = $this->authorizationScope;
        }
        if (null !== $this->authorizationRequirement) {
            $res['authorization_requirement'] = $this->authorizationRequirement;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPAuthorizationInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['authorization_model'])) {
            if (!empty($map['authorization_model'])) {
                $model->authorizationModel = $map['authorization_model'];
            }
        }
        if (isset($map['authorization_type'])) {
            if (!empty($map['authorization_type'])) {
                $model->authorizationType = $map['authorization_type'];
            }
        }
        if (isset($map['authorization_scope'])) {
            $model->authorizationScope = $map['authorization_scope'];
        }
        if (isset($map['authorization_requirement'])) {
            $model->authorizationRequirement = $map['authorization_requirement'];
        }

        return $model;
    }
}
