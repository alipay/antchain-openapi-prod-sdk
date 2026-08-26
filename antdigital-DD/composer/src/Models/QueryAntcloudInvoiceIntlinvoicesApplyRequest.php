<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class QueryAntcloudInvoiceIntlinvoicesApplyRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenantId' => 'tenant_id',
        'arNo' => 'ar_no',
        'currentPage' => 'current_page',
        'pageSize' => 'page_size',
    ];
    public function validate() {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('arNo', $this->arNo, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->arNo) {
            $res['ar_no'] = $this->arNo;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAntcloudInvoiceIntlinvoicesApplyRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['ar_no'])){
            $model->arNo = $map['ar_no'];
        }
        if(isset($map['current_page'])){
            $model->currentPage = $map['current_page'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        return $model;
    }
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

    // 合同或订单号
    /**
     * @var string
     */
    public $arNo;

    // 当前页码，默认1
    /**
     * @var int
     */
    public $currentPage;

    // 每页条数，默认20
    /**
     * @var int
     */
    public $pageSize;

}
