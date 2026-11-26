<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class DetailBlockchainBotIotsuccessProductKnowledgebaseResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'kbId' => 'kb_id',
        'name' => 'name',
        'description' => 'description',
        'provider' => 'provider',
        'enable' => 'enable',
        'contentCount' => 'content_count',
        'paragraphCount' => 'paragraph_count',
        'associatedProductKeys' => 'associated_product_keys',
    ];
    public function validate() {
        Model::validateRequired('kbId', $this->kbId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('provider', $this->provider, true);
        Model::validateRequired('enable', $this->enable, true);
        Model::validateRequired('contentCount', $this->contentCount, true);
        Model::validateRequired('paragraphCount', $this->paragraphCount, true);
        Model::validateRequired('associatedProductKeys', $this->associatedProductKeys, true);
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
        if (null !== $this->kbId) {
            $res['kb_id'] = $this->kbId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->provider) {
            $res['provider'] = $this->provider;
        }
        if (null !== $this->enable) {
            $res['enable'] = $this->enable;
        }
        if (null !== $this->contentCount) {
            $res['content_count'] = $this->contentCount;
        }
        if (null !== $this->paragraphCount) {
            $res['paragraph_count'] = $this->paragraphCount;
        }
        if (null !== $this->associatedProductKeys) {
            $res['associated_product_keys'] = $this->associatedProductKeys;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DetailBlockchainBotIotsuccessProductKnowledgebaseResponse
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
        if(isset($map['kb_id'])){
            $model->kbId = $map['kb_id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['provider'])){
            $model->provider = $map['provider'];
        }
        if(isset($map['enable'])){
            $model->enable = $map['enable'];
        }
        if(isset($map['content_count'])){
            $model->contentCount = $map['content_count'];
        }
        if(isset($map['paragraph_count'])){
            $model->paragraphCount = $map['paragraph_count'];
        }
        if(isset($map['associated_product_keys'])){
            if(!empty($map['associated_product_keys'])){
                $model->associatedProductKeys = $map['associated_product_keys'];
            }
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
    public $kbId;

    // 映射kbName
    /**
     * @var string
     */
    public $name;

    // 映射kbDescription
    /**
     * @var string
     */
    public $description;

    // 枚举:OFFICIAL,CUSTOM
    /**
     * @var string
     */
    public $provider;

    /**
     * @var bool
     */
    public $enable;

    // 映射docCount
    /**
     * @var int
     */
    public $contentCount;

    /**
     * @var int
     */
    public $paragraphCount;

    // 沿现有关联查询聚合；不新增版本账本
    /**
     * @var string[]
     */
    public $associatedProductKeys;

}
