<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class TrajectoryBlockchainBotIotagentSessionResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'scopesJson' => 'scopes_json',
        'coverageJson' => 'coverage_json',
        'nextCursor' => 'next_cursor',
        'totalScopes' => 'total_scopes',
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
        if (null !== $this->scopesJson) {
            $res['scopes_json'] = $this->scopesJson;
        }
        if (null !== $this->coverageJson) {
            $res['coverage_json'] = $this->coverageJson;
        }
        if (null !== $this->nextCursor) {
            $res['next_cursor'] = $this->nextCursor;
        }
        if (null !== $this->totalScopes) {
            $res['total_scopes'] = $this->totalScopes;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return TrajectoryBlockchainBotIotagentSessionResponse
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
        if(isset($map['scopes_json'])){
            $model->scopesJson = $map['scopes_json'];
        }
        if(isset($map['coverage_json'])){
            $model->coverageJson = $map['coverage_json'];
        }
        if(isset($map['next_cursor'])){
            $model->nextCursor = $map['next_cursor'];
        }
        if(isset($map['total_scopes'])){
            $model->totalScopes = $map['total_scopes'];
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

    // 轮次索引列表(JSON)
    /**
     * @var string
     */
    public $scopesJson;

    // 覆盖状态(JSON)
    /**
     * @var string
     */
    public $coverageJson;

    // 下一页游标
    /**
     * @var string
     */
    public $nextCursor;

    // 总轮次数
    /**
     * @var int
     */
    public $totalScopes;

}
