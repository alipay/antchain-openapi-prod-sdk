<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class StatusBlockchainBotIotsuccessProductSkillResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'pluginId' => 'plugin_id',
        'revision' => 'revision',
        'enable' => 'enable',
        'publishStatus' => 'publish_status',
        'errorMessage' => 'error_message',
    ];
    public function validate() {
        Model::validateRequired('pluginId', $this->pluginId, true);
        Model::validateRequired('revision', $this->revision, true);
        Model::validateRequired('enable', $this->enable, true);
        Model::validateRequired('publishStatus', $this->publishStatus, true);
        Model::validateRequired('errorMessage', $this->errorMessage, true);
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
        if (null !== $this->revision) {
            $res['revision'] = $this->revision;
        }
        if (null !== $this->enable) {
            $res['enable'] = $this->enable;
        }
        if (null !== $this->publishStatus) {
            $res['publish_status'] = $this->publishStatus;
        }
        if (null !== $this->errorMessage) {
            $res['error_message'] = $this->errorMessage;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return StatusBlockchainBotIotsuccessProductSkillResponse
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
        if(isset($map['revision'])){
            $model->revision = $map['revision'];
        }
        if(isset($map['enable'])){
            $model->enable = $map['enable'];
        }
        if(isset($map['publish_status'])){
            $model->publishStatus = $map['publish_status'];
        }
        if(isset($map['error_message'])){
            $model->errorMessage = $map['error_message'];
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

    // 既有Skill配置revision，缺失为null
    /**
     * @var string
     */
    public $revision;

    // 已有资产启用状态；不等于安全审核通过
    /**
     * @var bool
     */
    public $enable;

    // 已有权威资产安全状态；未接通或源字段不存在为null，不虚构READY
    /**
     * @var string
     */
    public $publishStatus;

    // 源记录有失败原因时脱敏返回，否则null
    /**
     * @var string
     */
    public $errorMessage;

}
