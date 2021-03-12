<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryDidDocSidekeyRequest extends Model
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

    // 是否需要分页返回
    /**
     * @var bool
     */
    public $needPage;

    // 按分页查询
    /**
     * @var int
     */
    public $pageNum;

    // 前缀+z40_uid
    /**
     * @var string
     */
    public $sideKey;

    // 通过外键查询did，需要以下条件之一：
    // 1. 查询者为外键前缀对应的did；
    // 2. 查询者能够提供外键前缀对应的did的授权vc。
    /**
     * @var string
     */
    public $verifiableClaim;

    // 场景码，找dis工作人员进行分配
    /**
     * @var string
     */
    public $bizCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'needPage'          => 'need_page',
        'pageNum'           => 'page_num',
        'sideKey'           => 'side_key',
        'verifiableClaim'   => 'verifiable_claim',
        'bizCode'           => 'biz_code',
    ];

    public function validate()
    {
        Model::validateRequired('sideKey', $this->sideKey, true);
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
        if (null !== $this->needPage) {
            $res['need_page'] = $this->needPage;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->sideKey) {
            $res['side_key'] = $this->sideKey;
        }
        if (null !== $this->verifiableClaim) {
            $res['verifiable_claim'] = $this->verifiableClaim;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDidDocSidekeyRequest
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
        if (isset($map['need_page'])) {
            $model->needPage = $map['need_page'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['side_key'])) {
            $model->sideKey = $map['side_key'];
        }
        if (isset($map['verifiable_claim'])) {
            $model->verifiableClaim = $map['verifiable_claim'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }

        return $model;
    }
}
