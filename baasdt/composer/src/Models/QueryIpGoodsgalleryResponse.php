<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryIpGoodsgalleryResponse extends Model
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

    // 图库链接
    /**
     * @var string
     */
    public $ipGalleryUrl;

    // 图库临时下载链接，过期时间2小时
    /**
     * @var string
     */
    public $ipGalleryTemporaryUrl;
    protected $_name = [
        'reqMsgId'              => 'req_msg_id',
        'resultCode'            => 'result_code',
        'resultMsg'             => 'result_msg',
        'ipGalleryUrl'          => 'ip_gallery_url',
        'ipGalleryTemporaryUrl' => 'ip_gallery_temporary_url',
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
        if (null !== $this->ipGalleryUrl) {
            $res['ip_gallery_url'] = $this->ipGalleryUrl;
        }
        if (null !== $this->ipGalleryTemporaryUrl) {
            $res['ip_gallery_temporary_url'] = $this->ipGalleryTemporaryUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryIpGoodsgalleryResponse
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
        if (isset($map['ip_gallery_url'])) {
            $model->ipGalleryUrl = $map['ip_gallery_url'];
        }
        if (isset($map['ip_gallery_temporary_url'])) {
            $model->ipGalleryTemporaryUrl = $map['ip_gallery_temporary_url'];
        }

        return $model;
    }
}
