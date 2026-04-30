<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryElectrocarDeviceinfospageRequest extends Model
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

    // trust_product_key
    /**
     * @var string
     */
    public $trustProductKey;

    // tuid
    /**
     * @var string
     */
    public $tuid;

    // page_num
    /**
     * @var int
     */
    public $pageNum;

    // page_size
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'trustProductKey'   => 'trust_product_key',
        'tuid'              => 'tuid',
        'pageNum'           => 'page_num',
        'pageSize'          => 'page_size',
    ];

    public function validate()
    {
        Model::validateRequired('trustProductKey', $this->trustProductKey, true);
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
        if (null !== $this->trustProductKey) {
            $res['trust_product_key'] = $this->trustProductKey;
        }
        if (null !== $this->tuid) {
            $res['tuid'] = $this->tuid;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryElectrocarDeviceinfospageRequest
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
        if (isset($map['trust_product_key'])) {
            $model->trustProductKey = $map['trust_product_key'];
        }
        if (isset($map['tuid'])) {
            $model->tuid = $map['tuid'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
