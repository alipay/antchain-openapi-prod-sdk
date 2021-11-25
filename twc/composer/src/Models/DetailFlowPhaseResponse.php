<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class DetailFlowPhaseResponse extends Model
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

    // 阶段存证交易hash
    /**
     * @var string
     */
    public $txHash;

    // 模板字段类型，Hash/Structure，(Hash->哈希,Structure->结构化)
    /**
     * @var string
     */
    public $dataType;

    // 阶段存证内容，如果模板数据类型定义是Hash(哈希)则返回存证时Hash，如果定义是Structure(结构化)，则返回所有字段json对象的字符串Base64后的值
    /**
     * @var string
     */
    public $notaryContent;

    // 结构化数据里面英文key对应的中文名称关系，json格式，key为字段英文名，value为字段中文名称
    //
    /**
     * @var string
     */
    public $dataTypeKey;

    // 阶段存证内容csv下载地址，暂时预留，存证内容过大时采用文件形式输出，有效期1个小时
    /**
     * @var string
     */
    public $url;

    // 交易所在的区块Hash
    /**
     * @var string
     */
    public $blockHash;

    // 交易所在的区块高
    /**
     * @var string
     */
    public $blockHeight;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'txHash'        => 'tx_hash',
        'dataType'      => 'data_type',
        'notaryContent' => 'notary_content',
        'dataTypeKey'   => 'data_type_key',
        'url'           => 'url',
        'blockHash'     => 'block_hash',
        'blockHeight'   => 'block_height',
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
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->dataType) {
            $res['data_type'] = $this->dataType;
        }
        if (null !== $this->notaryContent) {
            $res['notary_content'] = $this->notaryContent;
        }
        if (null !== $this->dataTypeKey) {
            $res['data_type_key'] = $this->dataTypeKey;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->blockHash) {
            $res['block_hash'] = $this->blockHash;
        }
        if (null !== $this->blockHeight) {
            $res['block_height'] = $this->blockHeight;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailFlowPhaseResponse
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
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['data_type'])) {
            $model->dataType = $map['data_type'];
        }
        if (isset($map['notary_content'])) {
            $model->notaryContent = $map['notary_content'];
        }
        if (isset($map['data_type_key'])) {
            $model->dataTypeKey = $map['data_type_key'];
        }
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }
        if (isset($map['block_hash'])) {
            $model->blockHash = $map['block_hash'];
        }
        if (isset($map['block_height'])) {
            $model->blockHeight = $map['block_height'];
        }

        return $model;
    }
}
