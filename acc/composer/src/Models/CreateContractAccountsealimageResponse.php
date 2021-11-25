<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class CreateContractAccountsealimageResponse extends Model
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

    // 印章fileKey
    //
    /**
     * @var string
     */
    public $fileKey;

    // 印章高度
    //
    /**
     * @var int
     */
    public $height;

    // 印章id
    //
    /**
     * @var string
     */
    public $sealId;

    // 印章下载地址, 有效时间1小时
    //
    /**
     * @var string
     */
    public $url;

    // 印章宽度
    //
    /**
     * @var int
     */
    public $width;

    // 业务码，0表示成功
    /**
     * @var int
     */
    public $code;

    // 业务码信息
    /**
     * @var string
     */
    public $message;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'fileKey'    => 'file_key',
        'height'     => 'height',
        'sealId'     => 'seal_id',
        'url'        => 'url',
        'width'      => 'width',
        'code'       => 'code',
        'message'    => 'message',
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
        if (null !== $this->fileKey) {
            $res['file_key'] = $this->fileKey;
        }
        if (null !== $this->height) {
            $res['height'] = $this->height;
        }
        if (null !== $this->sealId) {
            $res['seal_id'] = $this->sealId;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->width) {
            $res['width'] = $this->width;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateContractAccountsealimageResponse
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
        if (isset($map['file_key'])) {
            $model->fileKey = $map['file_key'];
        }
        if (isset($map['height'])) {
            $model->height = $map['height'];
        }
        if (isset($map['seal_id'])) {
            $model->sealId = $map['seal_id'];
        }
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }
        if (isset($map['width'])) {
            $model->width = $map['width'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }

        return $model;
    }
}
