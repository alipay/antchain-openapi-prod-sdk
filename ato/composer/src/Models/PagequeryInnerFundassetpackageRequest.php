<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class PagequeryInnerFundassetpackageRequest extends Model
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

    // 资产包id
    /**
     * @var string
     */
    public $assetPackageId;

    // 商家公司名称
    /**
     * @var string
     */
    public $merchantName;

    // 融资申请时间开始
    /**
     * @var string
     */
    public $financeApplyTimeStart;

    // 融资申请时间结束
    /**
     * @var string
     */
    public $financeApplyTimeEnd;

    // 放款状态
    /**
     * @var string
     */
    public $financeApplyStatus;

    // 分页信息
    /**
     * @var PageQuery
     */
    public $pageInfo;

    // traceId
    /**
     * @var string
     */
    public $traceId;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'assetPackageId'        => 'asset_package_id',
        'merchantName'          => 'merchant_name',
        'financeApplyTimeStart' => 'finance_apply_time_start',
        'financeApplyTimeEnd'   => 'finance_apply_time_end',
        'financeApplyStatus'    => 'finance_apply_status',
        'pageInfo'              => 'page_info',
        'traceId'               => 'trace_id',
    ];

    public function validate()
    {
        Model::validateRequired('assetPackageId', $this->assetPackageId, true);
        Model::validateRequired('pageInfo', $this->pageInfo, true);
        Model::validateRequired('traceId', $this->traceId, true);
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
        if (null !== $this->assetPackageId) {
            $res['asset_package_id'] = $this->assetPackageId;
        }
        if (null !== $this->merchantName) {
            $res['merchant_name'] = $this->merchantName;
        }
        if (null !== $this->financeApplyTimeStart) {
            $res['finance_apply_time_start'] = $this->financeApplyTimeStart;
        }
        if (null !== $this->financeApplyTimeEnd) {
            $res['finance_apply_time_end'] = $this->financeApplyTimeEnd;
        }
        if (null !== $this->financeApplyStatus) {
            $res['finance_apply_status'] = $this->financeApplyStatus;
        }
        if (null !== $this->pageInfo) {
            $res['page_info'] = null !== $this->pageInfo ? $this->pageInfo->toMap() : null;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryInnerFundassetpackageRequest
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
        if (isset($map['asset_package_id'])) {
            $model->assetPackageId = $map['asset_package_id'];
        }
        if (isset($map['merchant_name'])) {
            $model->merchantName = $map['merchant_name'];
        }
        if (isset($map['finance_apply_time_start'])) {
            $model->financeApplyTimeStart = $map['finance_apply_time_start'];
        }
        if (isset($map['finance_apply_time_end'])) {
            $model->financeApplyTimeEnd = $map['finance_apply_time_end'];
        }
        if (isset($map['finance_apply_status'])) {
            $model->financeApplyStatus = $map['finance_apply_status'];
        }
        if (isset($map['page_info'])) {
            $model->pageInfo = PageQuery::fromMap($map['page_info']);
        }
        if (isset($map['trace_id'])) {
            $model->traceId = $map['trace_id'];
        }

        return $model;
    }
}
