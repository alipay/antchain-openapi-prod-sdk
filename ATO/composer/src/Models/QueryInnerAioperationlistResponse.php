<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

use AntChain\ATO\Models\AIOperationTenant;

class QueryInnerAioperationlistResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'aiOperationTenantList' => 'ai_operation_tenant_list',
    ];
    public function validate() {}
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
        if (null !== $this->aiOperationTenantList) {
            $res['ai_operation_tenant_list'] = [];
            if(null !== $this->aiOperationTenantList && is_array($this->aiOperationTenantList)){
                $n = 0;
                foreach($this->aiOperationTenantList as $item){
                    $res['ai_operation_tenant_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryInnerAioperationlistResponse
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
        if(isset($map['ai_operation_tenant_list'])){
            if(!empty($map['ai_operation_tenant_list'])){
                $model->aiOperationTenantList = [];
                $n = 0;
                foreach($map['ai_operation_tenant_list'] as $item) {
                    $model->aiOperationTenantList[$n++] = null !== $item ? AIOperationTenant::fromMap($item) : $item;
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

    // AI经营团队可操作租户结构体
    /**
     * @var AIOperationTenant[]
     */
    public $aiOperationTenantList;

}
