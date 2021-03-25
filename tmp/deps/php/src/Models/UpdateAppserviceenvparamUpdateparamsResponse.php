<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\AppServiceEnvParam;

class UpdateAppserviceenvparamUpdateparamsResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'appServiceEnvParam' => 'app_service_env_param',
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
        if (null !== $this->appServiceEnvParam) {
            $res['app_service_env_param'] = [];
            if(null !== $this->appServiceEnvParam && is_array($this->appServiceEnvParam)){
                $n = 0;
                foreach($this->appServiceEnvParam as $item){
                    $res['app_service_env_param'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateAppserviceenvparamUpdateparamsResponse
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
        if(isset($map['app_service_env_param'])){
            if(!empty($map['app_service_env_param'])){
                $model->appServiceEnvParam = [];
                $n = 0;
                foreach($map['app_service_env_param'] as $item) {
                    $model->appServiceEnvParam[$n++] = null !== $item ? AppServiceEnvParam::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // AppServiceEnvParam集合
    /**
     * @var AppServiceEnvParam[]
     */
    public $appServiceEnvParam;

}
