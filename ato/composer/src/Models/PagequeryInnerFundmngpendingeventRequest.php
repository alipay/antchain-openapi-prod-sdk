<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class PagequeryInnerFundmngpendingeventRequest extends Model
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

    // 资方租户id
    /**
     * @var string
     */
    public $fundTenantId;

    // ("PENDING","待办中"),
    // ("CONFIRMED","确认"),
    //
    /**
     * @var string[]
     */
    public $statusList;

    // 事件code
    // 用户履约离线数据下载完成
    // DATAPHIN_FUND_MNG_DOWNLOAD_USER_PROMISE_FINISH
    /**
     * @var string
     */
    public $pendingCode;

    // 分页参数
    /**
     * @var PageQuery
     */
    public $pageInfo;

    // 页面traceId
    /**
     * @var string
     */
    public $traceId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fundTenantId'      => 'fund_tenant_id',
        'statusList'        => 'status_list',
        'pendingCode'       => 'pending_code',
        'pageInfo'          => 'page_info',
        'traceId'           => 'trace_id',
    ];

    public function validate()
    {
        Model::validateRequired('fundTenantId', $this->fundTenantId, true);
        Model::validateRequired('statusList', $this->statusList, true);
        Model::validateRequired('pendingCode', $this->pendingCode, true);
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
        if (null !== $this->fundTenantId) {
            $res['fund_tenant_id'] = $this->fundTenantId;
        }
        if (null !== $this->statusList) {
            $res['status_list'] = $this->statusList;
        }
        if (null !== $this->pendingCode) {
            $res['pending_code'] = $this->pendingCode;
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
     * @return PagequeryInnerFundmngpendingeventRequest
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
        if (isset($map['fund_tenant_id'])) {
            $model->fundTenantId = $map['fund_tenant_id'];
        }
        if (isset($map['status_list'])) {
            if (!empty($map['status_list'])) {
                $model->statusList = $map['status_list'];
            }
        }
        if (isset($map['pending_code'])) {
            $model->pendingCode = $map['pending_code'];
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
