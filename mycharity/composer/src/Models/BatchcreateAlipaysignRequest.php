<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYCHARITY\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateAlipaysignRequest extends Model
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

    // 机构id
    /**
     * @var string
     */
    public $orgId;

    // 代扣签约账号信息列表
    /**
     * @var SignUserInfo[]
     */
    public $signUserInfoList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orgId'             => 'org_id',
        'signUserInfoList'  => 'sign_user_info_list',
    ];

    public function validate()
    {
        Model::validateRequired('orgId', $this->orgId, true);
        Model::validateRequired('signUserInfoList', $this->signUserInfoList, true);
        Model::validateMaxLength('orgId', $this->orgId, 50);
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
        if (null !== $this->orgId) {
            $res['org_id'] = $this->orgId;
        }
        if (null !== $this->signUserInfoList) {
            $res['sign_user_info_list'] = [];
            if (null !== $this->signUserInfoList && \is_array($this->signUserInfoList)) {
                $n = 0;
                foreach ($this->signUserInfoList as $item) {
                    $res['sign_user_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateAlipaysignRequest
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
        if (isset($map['org_id'])) {
            $model->orgId = $map['org_id'];
        }
        if (isset($map['sign_user_info_list'])) {
            if (!empty($map['sign_user_info_list'])) {
                $model->signUserInfoList = [];
                $n                       = 0;
                foreach ($map['sign_user_info_list'] as $item) {
                    $model->signUserInfoList[$n++] = null !== $item ? SignUserInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
