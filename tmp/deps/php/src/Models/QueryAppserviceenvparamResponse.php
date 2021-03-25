<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\AppServiceEnvParam;

class QueryAppserviceenvparamResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'appServiceEnvParams' => 'app_service_env_params',
        'currentPage' => 'current_page',
        'pageSize' => 'page_size',
        'totalCount' => 'total_count',
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
        if (null !== $this->appServiceEnvParams) {
            $res['app_service_env_params'] = [];
            if(null !== $this->appServiceEnvParams && is_array($this->appServiceEnvParams)){
                $n = 0;
                foreach($this->appServiceEnvParams as $item){
                    $res['app_service_env_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAppserviceenvparamResponse
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
        if(isset($map['app_service_env_params'])){
            if(!empty($map['app_service_env_params'])){
                $model->appServiceEnvParams = [];
                $n = 0;
                foreach($map['app_service_env_params'] as $item) {
                    $model->appServiceEnvParams[$n++] = null !== $item ? AppServiceEnvParam::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['current_page'])){
            $model->currentPage = $map['current_page'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['total_count'])){
            $model->totalCount = $map['total_count'];
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

    // app_service_env_params
    /**
     * @var AppServiceEnvParam[]
     */
    public $appServiceEnvParams;

    // current_page
    /**
     * @var int
     */
    public $currentPage;

    // page_size
    /**
     * @var int
     */
    public $pageSize;

    // total_count
    /**
     * @var int
     */
    public $totalCount;

}
