<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class CreateBlockchainBotIotsuccessProductMcpResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'pluginId' => 'plugin_id',
        'state' => 'state',
        'headerNames' => 'header_names',
        'hasSecret' => 'has_secret',
    ];
    public function validate() {
        Model::validateRequired('pluginId', $this->pluginId, true);
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('headerNames', $this->headerNames, true);
        Model::validateRequired('hasSecret', $this->hasSecret, true);
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
        if (null !== $this->pluginId) {
            $res['plugin_id'] = $this->pluginId;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->headerNames) {
            $res['header_names'] = $this->headerNames;
        }
        if (null !== $this->hasSecret) {
            $res['has_secret'] = $this->hasSecret;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateBlockchainBotIotsuccessProductMcpResponse
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
        if(isset($map['plugin_id'])){
            $model->pluginId = $map['plugin_id'];
        }
        if(isset($map['state'])){
            $model->state = $map['state'];
        }
        if(isset($map['header_names'])){
            if(!empty($map['header_names'])){
                $model->headerNames = $map['header_names'];
            }
        }
        if(isset($map['has_secret'])){
            $model->hasSecret = $map['has_secret'];
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
     * @var string
     */
    public $pluginId;

    // 枚举:REVIEWING,READY,FAILED
    /**
     * @var string
     */
    public $state;

    /**
     * @var string[]
     */
    public $headerNames;

    /**
     * @var bool
     */
    public $hasSecret;

}
