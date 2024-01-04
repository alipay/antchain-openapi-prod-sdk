<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class AllAntchainAtoSignTemplateResponse extends Model
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

    // List<Object>格式，详细参考：
    // [
    // {
    // "templateCode": "TEST_001",
    // "tenantId": "BIPCCOQY",
    // "agreementType": "SERVICE_LEASE",
    // "fileName": "测试模板之协议签署证明",
    // "templateId": "f28038577d664015bfc1034c4a125121",
    // "fieldArgs": "{\"sceneName\":\"测试协议合同签署\",\"title\":\"这是一份证明协议\"}",
    // "userPos": "[{\"required\":true,\"posPage\":\"1\",\"posX\":\"162.44\",\"posY\":\"425\"}]",
    // "orgPos": "[{\"required\":true,\"posPage\":\"1\",\"posX\":\"449.99\",\"posY\":\"420.03\"}]"
    // }
    // ]
    /**
     * @var string
     */
    public $templateList;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'templateList' => 'template_list',
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
        if (null !== $this->templateList) {
            $res['template_list'] = $this->templateList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AllAntchainAtoSignTemplateResponse
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
        if (isset($map['template_list'])) {
            $model->templateList = $map['template_list'];
        }

        return $model;
    }
}
