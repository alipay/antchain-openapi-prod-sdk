<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class QueryYhllRequest extends Model
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

    // 城市编码
    /**
     * @var string
     */
    public $cityCode;

    // uuid
    /**
     * @var string
     */
    public $uuid;

    // page size
    /**
     * @var int
     */
    public $pageSize;

    // page number
    /**
     * @var int
     */
    public $pageNum;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'cityCode'          => 'city_code',
        'uuid'              => 'uuid',
        'pageSize'          => 'page_size',
        'pageNum'           => 'page_num',
    ];

    public function validate()
    {
        Model::validateRequired('cityCode', $this->cityCode, true);
        Model::validateRequired('uuid', $this->uuid, true);
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
        if (null !== $this->cityCode) {
            $res['city_code'] = $this->cityCode;
        }
        if (null !== $this->uuid) {
            $res['uuid'] = $this->uuid;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryYhllRequest
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
        if (isset($map['city_code'])) {
            $model->cityCode = $map['city_code'];
        }
        if (isset($map['uuid'])) {
            $model->uuid = $map['uuid'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }

        return $model;
    }
}
