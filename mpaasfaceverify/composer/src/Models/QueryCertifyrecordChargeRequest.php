<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MPAASFACEVERIFY\Models;

use AlibabaCloud\Tea\Model;

class QueryCertifyrecordChargeRequest extends Model
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

    // 待查询的certify_id列表
    /**
     * @var string[]
     */
    public $certifyIdList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'certifyIdList'     => 'certify_id_list',
    ];

    public function validate()
    {
        Model::validateRequired('certifyIdList', $this->certifyIdList, true);
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
        if (null !== $this->certifyIdList) {
            $res['certify_id_list'] = $this->certifyIdList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCertifyrecordChargeRequest
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
        if (isset($map['certify_id_list'])) {
            if (!empty($map['certify_id_list'])) {
                $model->certifyIdList = $map['certify_id_list'];
            }
        }

        return $model;
    }
}
