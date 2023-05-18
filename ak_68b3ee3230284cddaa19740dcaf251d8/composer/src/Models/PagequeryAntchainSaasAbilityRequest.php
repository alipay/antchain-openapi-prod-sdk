<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_68b3ee3230284cddaa19740dcaf251d8\Models;

use AlibabaCloud\Tea\Model;

class PagequeryAntchainSaasAbilityRequest extends Model
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

    // 当前页码
    /**
     * @var int
     */
    public $current;

    // 每页大小
    /**
     * @var int
     */
    public $pageSize;

    // 用于能力的搜索标签
    /**
     * @var string
     */
    public $keyword;

    // 网关产品码
    /**
     * @var string
     */
    public $prodCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'current'           => 'current',
        'pageSize'          => 'page_size',
        'keyword'           => 'keyword',
        'prodCode'          => 'prod_code',
    ];

    public function validate()
    {
        Model::validateRequired('current', $this->current, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
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
        if (null !== $this->keyword) {
            $res['keyword'] = $this->keyword;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryAntchainSaasAbilityRequest
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
        if (isset($map['keyword'])) {
            $model->keyword = $map['keyword'];
        }
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }

        return $model;
    }
}
