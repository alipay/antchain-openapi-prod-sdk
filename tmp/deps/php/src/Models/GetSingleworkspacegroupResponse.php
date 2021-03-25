<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class GetSingleworkspacegroupResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'identity' => 'identity',
        'name' => 'name',
        'releaseMode' => 'release_mode',
        'domainSuffix' => 'domain_suffix',
        'workspaces' => 'workspaces',
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
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->releaseMode) {
            $res['release_mode'] = $this->releaseMode;
        }
        if (null !== $this->domainSuffix) {
            $res['domain_suffix'] = $this->domainSuffix;
        }
        if (null !== $this->workspaces) {
            $res['workspaces'] = $this->workspaces;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetSingleworkspacegroupResponse
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
        if(isset($map['identity'])){
            $model->identity = $map['identity'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['release_mode'])){
            $model->releaseMode = $map['release_mode'];
        }
        if(isset($map['domain_suffix'])){
            $model->domainSuffix = $map['domain_suffix'];
        }
        if(isset($map['workspaces'])){
            if(!empty($map['workspaces'])){
                $model->workspaces = $map['workspaces'];
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

    // 工作空间组标识。
    /**
     * @var string
     */
    public $identity;

    // 工作空间组显示名称。
    /**
     * @var string
     */
    public $name;

    // 部署模式。
    /**
     * @var string
     */
    public $releaseMode;

    // 域名后缀。
    /**
     * @var string
     */
    public $domainSuffix;

    // 包含工作空间名称列表。
    /**
     * @var string[]
     */
    public $workspaces;

}
