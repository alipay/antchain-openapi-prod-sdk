<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_1f51f68dfc5d438387dbbaa76f5997f4\Models;

use AlibabaCloud\Tea\Model;

class QueryAntchainMytcMiniCertResponse extends Model
{
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

    // 区块信息
    /**
     * @var BlockInfo
     */
    public $blockInfo;

    // 上传者信息
    /**
     * @var UploaderInfo
     */
    public $uploadInfo;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'blockInfo'  => 'block_info',
        'uploadInfo' => 'upload_info',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
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
        if (null !== $this->blockInfo) {
            $res['block_info'] = null !== $this->blockInfo ? $this->blockInfo->toMap() : null;
        }
        if (null !== $this->uploadInfo) {
            $res['upload_info'] = null !== $this->uploadInfo ? $this->uploadInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntchainMytcMiniCertResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['block_info'])) {
            $model->blockInfo = BlockInfo::fromMap($map['block_info']);
        }
        if (isset($map['upload_info'])) {
            $model->uploadInfo = UploaderInfo::fromMap($map['upload_info']);
        }

        return $model;
    }
}
