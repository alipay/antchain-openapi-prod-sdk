<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETING\Models;

use AlibabaCloud\Tea\Model;

class QueryCouponPageRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 租户ID
    /**
     * @var string
     */
    public $tenantId;

    // 商品code
    /**
     * @var string
     */
    public $productCodes;

    // 优惠券类型:VOUCHER 抵用券, CERTAIN 满减券,DISCOUNT 折扣券
    //
    /**
     * @var string
     */
    public $couponType;

    // 当前页，默认第一页
    /**
     * @var int
     */
    public $pageNo;

    // 每页显示数量，默认10条
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'    => 'auth_token',
        'tenantId'     => 'tenant_id',
        'productCodes' => 'product_codes',
        'couponType'   => 'coupon_type',
        'pageNo'       => 'page_no',
        'pageSize'     => 'page_size',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('productCodes', $this->productCodes, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->productCodes) {
            $res['product_codes'] = $this->productCodes;
        }
        if (null !== $this->couponType) {
            $res['coupon_type'] = $this->couponType;
        }
        if (null !== $this->pageNo) {
            $res['page_no'] = $this->pageNo;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCouponPageRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['product_codes'])) {
            $model->productCodes = $map['product_codes'];
        }
        if (isset($map['coupon_type'])) {
            $model->couponType = $map['coupon_type'];
        }
        if (isset($map['page_no'])) {
            $model->pageNo = $map['page_no'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
