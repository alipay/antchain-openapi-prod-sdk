<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\IOTAGENT\Models\OpenApiQuotaConsumptionItem;

class ListBlockchainBotIotsuccessProductQuotaConsumptionResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'total' => 'total',
        'pageIndex' => 'page_index',
        'pageSize' => 'page_size',
        'scope' => 'scope',
        'sharedPool' => 'shared_pool',
        'resourceType' => 'resource_type',
        'unit' => 'unit',
        'coverageFrom' => 'coverage_from',
        'complete' => 'complete',
        'asOf' => 'as_of',
        'items' => 'items',
    ];
    public function validate() {
        Model::validateRequired('total', $this->total, true);
        Model::validateRequired('pageIndex', $this->pageIndex, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('scope', $this->scope, true);
        Model::validateRequired('sharedPool', $this->sharedPool, true);
        Model::validateRequired('resourceType', $this->resourceType, true);
        Model::validateRequired('unit', $this->unit, true);
        Model::validateRequired('coverageFrom', $this->coverageFrom, true);
        Model::validateRequired('complete', $this->complete, true);
        Model::validateRequired('asOf', $this->asOf, true);
        Model::validateRequired('items', $this->items, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->pageIndex) {
            $res['page_index'] = $this->pageIndex;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->sharedPool) {
            $res['shared_pool'] = $this->sharedPool;
        }
        if (null !== $this->resourceType) {
            $res['resource_type'] = $this->resourceType;
        }
        if (null !== $this->unit) {
            $res['unit'] = $this->unit;
        }
        if (null !== $this->coverageFrom) {
            $res['coverage_from'] = $this->coverageFrom;
        }
        if (null !== $this->complete) {
            $res['complete'] = $this->complete;
        }
        if (null !== $this->asOf) {
            $res['as_of'] = $this->asOf;
        }
        if (null !== $this->items) {
            $res['items'] = [];
            if(null !== $this->items && is_array($this->items)){
                $n = 0;
                foreach($this->items as $item){
                    $res['items'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ListBlockchainBotIotsuccessProductQuotaConsumptionResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['total'])){
            $model->total = $map['total'];
        }
        if(isset($map['page_index'])){
            $model->pageIndex = $map['page_index'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['scope'])){
            $model->scope = $map['scope'];
        }
        if(isset($map['shared_pool'])){
            $model->sharedPool = $map['shared_pool'];
        }
        if(isset($map['resource_type'])){
            $model->resourceType = $map['resource_type'];
        }
        if(isset($map['unit'])){
            $model->unit = $map['unit'];
        }
        if(isset($map['coverage_from'])){
            $model->coverageFrom = $map['coverage_from'];
        }
        if(isset($map['complete'])){
            $model->complete = $map['complete'];
        }
        if(isset($map['as_of'])){
            $model->asOf = $map['as_of'];
        }
        if(isset($map['items'])){
            if(!empty($map['items'])){
                $model->items = [];
                $n = 0;
                foreach($map['items'] as $item) {
                    $model->items[$n++] = null !== $item ? OpenApiQuotaConsumptionItem::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    /**
     * @var int
     */
    public $total;

    /**
     * @var int
     */
    public $pageIndex;

    /**
     * @var int
     */
    public $pageSize;

    // 枚举:LICENSES,INSTANCE_POOL
    /**
     * @var string
     */
    public $scope;

    /**
     * @var bool
     */
    public $sharedPool;

    // 枚举:AGENT_REQUEST
    /**
     * @var string
     */
    public $resourceType;

    // 枚举:QUOTA_POINT
    /**
     * @var string
     */
    public $unit;

    // 所有入口切换并完成在途处理和基准余额保存后的可靠覆盖起点；未知为null
    /**
     * @var string
     */
    public $coverageFrom;

    // 当前请求范围中所有周期均有已提交流水覆盖
    /**
     * @var bool
     */
    public $complete;

    // 本次强一致查询时点，不是完整结算水位或跨页快照
    /**
     * @var string
     */
    public $asOf;

    /**
     * @var OpenApiQuotaConsumptionItem[]
     */
    public $items;

}
