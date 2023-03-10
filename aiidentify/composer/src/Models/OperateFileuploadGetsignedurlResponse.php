<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AIIDENTIFY\Models;

use AlibabaCloud\Tea\Model;

class OperateFileuploadGetsignedurlResponse extends Model
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

    // 文件ID(用于 提交数据进行AI鉴定 时图片对应的属性值)
    /**
     * @var string
     */
    public $fileId;

    // oss上传文件链接
    /**
     * @var string
     */
    public $ossUrl;

    // oss上传文件时的ossKey值
    /**
     * @var string
     */
    public $ossKey;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'fileId'     => 'file_id',
        'ossUrl'     => 'oss_url',
        'ossKey'     => 'oss_key',
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
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->ossUrl) {
            $res['oss_url'] = $this->ossUrl;
        }
        if (null !== $this->ossKey) {
            $res['oss_key'] = $this->ossKey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateFileuploadGetsignedurlResponse
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
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['oss_url'])) {
            $model->ossUrl = $map['oss_url'];
        }
        if (isset($map['oss_key'])) {
            $model->ossKey = $map['oss_key'];
        }

        return $model;
    }
}
