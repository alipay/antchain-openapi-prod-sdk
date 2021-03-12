<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryDigitalassetartArtResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 艺术品id
    /**
     * @var string
     */
    public $artId;

    // 艺术品名称
    /**
     * @var string
     */
    public $artName;

    // 艺术品代码
    /**
     * @var string
     */
    public $code;

    // 艺术品所在交易所代码
    /**
     * @var string[]
     */
    public $exchanges;

    // 艺术品鉴定者列表
    /**
     * @var string[]
     */
    public $identifiers;

    // 艺术品图片哈希
    /**
     * @var string[]
     */
    public $imageHash;

    // 发行方账户信息
    /**
     * @var string
     */
    public $issueAccount;

    // 艺术品在链上发行时间
    /**
     * @var int
     */
    public $issueDate;

    // 艺术品所属主分类
    /**
     * @var string
     */
    public $mainClass;

    // 艺术品拥有者id
    /**
     * @var string
     */
    public $ownerId;

    // 艺术品状态信息
    // 1未发行
    // 2已发行
    // 3冻结
    // 4回购
    /**
     * @var int
     */
    public $state;

    // 艺术品所属分类次分类
    /**
     * @var string
     */
    public $subClass;

    // 艺术品视频哈希
    /**
     * @var string
     */
    public $vedioHash;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'artId'        => 'art_id',
        'artName'      => 'art_name',
        'code'         => 'code',
        'exchanges'    => 'exchanges',
        'identifiers'  => 'identifiers',
        'imageHash'    => 'image_hash',
        'issueAccount' => 'issue_account',
        'issueDate'    => 'issue_date',
        'mainClass'    => 'main_class',
        'ownerId'      => 'owner_id',
        'state'        => 'state',
        'subClass'     => 'sub_class',
        'vedioHash'    => 'vedio_hash',
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
        if (null !== $this->artId) {
            $res['art_id'] = $this->artId;
        }
        if (null !== $this->artName) {
            $res['art_name'] = $this->artName;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->exchanges) {
            $res['exchanges'] = $this->exchanges;
        }
        if (null !== $this->identifiers) {
            $res['identifiers'] = $this->identifiers;
        }
        if (null !== $this->imageHash) {
            $res['image_hash'] = $this->imageHash;
        }
        if (null !== $this->issueAccount) {
            $res['issue_account'] = $this->issueAccount;
        }
        if (null !== $this->issueDate) {
            $res['issue_date'] = $this->issueDate;
        }
        if (null !== $this->mainClass) {
            $res['main_class'] = $this->mainClass;
        }
        if (null !== $this->ownerId) {
            $res['owner_id'] = $this->ownerId;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->subClass) {
            $res['sub_class'] = $this->subClass;
        }
        if (null !== $this->vedioHash) {
            $res['vedio_hash'] = $this->vedioHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDigitalassetartArtResponse
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
        if (isset($map['art_id'])) {
            $model->artId = $map['art_id'];
        }
        if (isset($map['art_name'])) {
            $model->artName = $map['art_name'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['exchanges'])) {
            if (!empty($map['exchanges'])) {
                $model->exchanges = $map['exchanges'];
            }
        }
        if (isset($map['identifiers'])) {
            if (!empty($map['identifiers'])) {
                $model->identifiers = $map['identifiers'];
            }
        }
        if (isset($map['image_hash'])) {
            if (!empty($map['image_hash'])) {
                $model->imageHash = $map['image_hash'];
            }
        }
        if (isset($map['issue_account'])) {
            $model->issueAccount = $map['issue_account'];
        }
        if (isset($map['issue_date'])) {
            $model->issueDate = $map['issue_date'];
        }
        if (isset($map['main_class'])) {
            $model->mainClass = $map['main_class'];
        }
        if (isset($map['owner_id'])) {
            $model->ownerId = $map['owner_id'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['sub_class'])) {
            $model->subClass = $map['sub_class'];
        }
        if (isset($map['vedio_hash'])) {
            $model->vedioHash = $map['vedio_hash'];
        }

        return $model;
    }
}
