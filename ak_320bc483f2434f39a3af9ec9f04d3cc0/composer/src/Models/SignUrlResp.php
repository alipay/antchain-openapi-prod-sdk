<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;

class SignUrlResp extends Model
{
    // 0-企业 1-用户
    /**
     * @example 0
     *
     * @var int
     */
    public $type;

    // 企业名称或用户姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $name;

    // 社会信用代码或身份证号
    /**
     * @example 220111************
     *
     * @var string
     */
    public $certNo;

    // 手动签署url（长链接）
    /**
     * @example http://alipay.com
     *
     * @var string
     */
    public $url;

    // 手动签署url(端链接)
    /**
     * @example http://alipay.com
     *
     * @var string
     */
    public $shortUrl;

    // 电子合同签署区id
    /**
     * @example asdassdsa
     *
     * @var string
     */
    public $signFiledId;
    protected $_name = [
        'type'        => 'type',
        'name'        => 'name',
        'certNo'      => 'cert_no',
        'url'         => 'url',
        'shortUrl'    => 'short_url',
        'signFiledId' => 'sign_filed_id',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('signFiledId', $this->signFiledId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->shortUrl) {
            $res['short_url'] = $this->shortUrl;
        }
        if (null !== $this->signFiledId) {
            $res['sign_filed_id'] = $this->signFiledId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SignUrlResp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }
        if (isset($map['short_url'])) {
            $model->shortUrl = $map['short_url'];
        }
        if (isset($map['sign_filed_id'])) {
            $model->signFiledId = $map['sign_filed_id'];
        }

        return $model;
    }
}
