<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTTS\Models;

use AlibabaCloud\Tea\Model;

class PagequeryDacDepositRequest extends Model
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

    // 查询第几页，从1开始
    /**
     * @var int
     */
    public $current;

    // 每页展示多少条，默认10
    /**
     * @var int
     */
    public $pageSize;

    // 外部用户唯一id
    /**
     * @var string
     */
    public $externalCustomerId;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'current'            => 'current',
        'pageSize'           => 'page_size',
        'externalCustomerId' => 'external_customer_id',
    ];

    public function validate()
    {
        Model::validateRequired('current', $this->current, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('externalCustomerId', $this->externalCustomerId, true);
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
        if (null !== $this->current) {
            $res['current'] = $this->current;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->externalCustomerId) {
            $res['external_customer_id'] = $this->externalCustomerId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryDacDepositRequest
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
        if (isset($map['current'])) {
            $model->current = $map['current'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['external_customer_id'])) {
            $model->externalCustomerId = $map['external_customer_id'];
        }

        return $model;
    }
}
