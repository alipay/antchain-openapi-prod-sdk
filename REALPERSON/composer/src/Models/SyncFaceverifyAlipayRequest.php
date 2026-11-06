<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class SyncFaceverifyAlipayRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outerOrderNo' => 'outer_order_no',
        'tenantId' => 'tenant_id',
        'asopTicketId' => 'asop_ticket_id',
        'externParam' => 'extern_param',
    ];
    public function validate() {
        Model::validateRequired('outerOrderNo', $this->outerOrderNo, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('asopTicketId', $this->asopTicketId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->outerOrderNo) {
            $res['outer_order_no'] = $this->outerOrderNo;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->asopTicketId) {
            $res['asop_ticket_id'] = $this->asopTicketId;
        }
        if (null !== $this->externParam) {
            $res['extern_param'] = $this->externParam;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SyncFaceverifyAlipayRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['outer_order_no'])){
            $model->outerOrderNo = $map['outer_order_no'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['asop_ticket_id'])){
            $model->asopTicketId = $map['asop_ticket_id'];
        }
        if(isset($map['extern_param'])){
            $model->externParam = $map['extern_param'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 业务请求唯一标识
    /**
     * @var string
     */
    public $outerOrderNo;

    // 数科租户 ID
    /**
     * @var string
     */
    public $tenantId;

    // ASOP审批单号
    /**
     * @var string
     */
    public $asopTicketId;

    // 扩展参数
    /**
     * @var string
     */
    public $externParam;

}
