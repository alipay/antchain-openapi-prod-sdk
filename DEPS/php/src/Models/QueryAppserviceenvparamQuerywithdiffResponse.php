<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\AppServiceEnvParam;

class QueryAppserviceenvparamQuerywithdiffResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'appServiceEnvParamDiff' => 'app_service_env_param_diff',
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
        if (null !== $this->appServiceEnvParamDiff) {
            $res['app_service_env_param_diff'] = [];
            if(null !== $this->appServiceEnvParamDiff && is_array($this->appServiceEnvParamDiff)){
                $n = 0;
                foreach($this->appServiceEnvParamDiff as $item){
                    $res['app_service_env_param_diff'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAppserviceenvparamQuerywithdiffResponse
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
        if(isset($map['app_service_env_param_diff'])){
            if(!empty($map['app_service_env_param_diff'])){
                $model->appServiceEnvParamDiff = [];
                $n = 0;
                foreach($map['app_service_env_param_diff'] as $item) {
                    $model->appServiceEnvParamDiff[$n++] = null !== $item ? AppServiceEnvParam::fromMap($item) : $item;
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

    // json字符串
    /**
     * @var AppServiceEnvParam[]
     */
    public $appServiceEnvParamDiff;

}
