<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryCreditIssuescpticketresultResponse extends Model
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

    // 申请唯一流水号
    /**
     * @var string
     */
    public $applyId;

    // 电子回单下载地址,链接有有效期
    /**
     * @var string
     */
    public $fileDownloadUrl;

    // 集团平台方分布式数字身份
    //
    /**
     * @var string
     */
    public $groupPlatformDid;

    // 业务发起方分布式数字身
    /**
     * @var string
     */
    public $platformDid;

    // 产品id
    //
    /**
     * @var string
     */
    public $productId;

    // 状态
    /**
     * @var string
     */
    public $status;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'applyId'          => 'apply_id',
        'fileDownloadUrl'  => 'file_download_url',
        'groupPlatformDid' => 'group_platform_did',
        'platformDid'      => 'platform_did',
        'productId'        => 'product_id',
        'status'           => 'status',
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
        if (null !== $this->applyId) {
            $res['apply_id'] = $this->applyId;
        }
        if (null !== $this->fileDownloadUrl) {
            $res['file_download_url'] = $this->fileDownloadUrl;
        }
        if (null !== $this->groupPlatformDid) {
            $res['group_platform_did'] = $this->groupPlatformDid;
        }
        if (null !== $this->platformDid) {
            $res['platform_did'] = $this->platformDid;
        }
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCreditIssuescpticketresultResponse
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
        if (isset($map['apply_id'])) {
            $model->applyId = $map['apply_id'];
        }
        if (isset($map['file_download_url'])) {
            $model->fileDownloadUrl = $map['file_download_url'];
        }
        if (isset($map['group_platform_did'])) {
            $model->groupPlatformDid = $map['group_platform_did'];
        }
        if (isset($map['platform_did'])) {
            $model->platformDid = $map['platform_did'];
        }
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
