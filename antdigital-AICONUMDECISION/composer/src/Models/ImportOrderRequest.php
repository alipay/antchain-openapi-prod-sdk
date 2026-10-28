<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AICONUMDECISION\Models;

use AlibabaCloud\Tea\Model;

use AntChain\AICONUMDECISION\Models\CustomerItem;

class ImportOrderRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'strategyTaskId' => 'strategy_task_id',
        'requestNo' => 'request_no',
        'customers' => 'customers',
        'mobileFormat' => 'mobile_format',
    ];
    public function validate() {
        Model::validateRequired('strategyTaskId', $this->strategyTaskId, true);
        Model::validateRequired('requestNo', $this->requestNo, true);
        Model::validateRequired('customers', $this->customers, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->strategyTaskId) {
            $res['strategy_task_id'] = $this->strategyTaskId;
        }
        if (null !== $this->requestNo) {
            $res['request_no'] = $this->requestNo;
        }
        if (null !== $this->customers) {
            $res['customers'] = [];
            if(null !== $this->customers && is_array($this->customers)){
                $n = 0;
                foreach($this->customers as $item){
                    $res['customers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->mobileFormat) {
            $res['mobile_format'] = $this->mobileFormat;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ImportOrderRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['strategy_task_id'])){
            $model->strategyTaskId = $map['strategy_task_id'];
        }
        if(isset($map['request_no'])){
            $model->requestNo = $map['request_no'];
        }
        if(isset($map['customers'])){
            if(!empty($map['customers'])){
                $model->customers = [];
                $n = 0;
                foreach($map['customers'] as $item) {
                    $model->customers[$n++] = null !== $item ? CustomerItem::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['mobile_format'])){
            $model->mobileFormat = $map['mobile_format'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 投放任务ID
    /**
     * @var int
     */
    public $strategyTaskId;

    // 客户请求流水号
    /**
     * @var string
     */
    public $requestNo;

    // 客户号码列表
    /**
     * @var CustomerItem[]
     */
    public $customers;

    // 手机号传入格式:PLAIN明文 / MD5 / SHA256，不填即为默认PLAIN
    /**
     * @var string
     */
    public $mobileFormat;

}
