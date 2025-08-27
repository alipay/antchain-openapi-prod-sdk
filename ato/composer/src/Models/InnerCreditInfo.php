<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class InnerCreditInfo extends Model
{
    // 凭证内容id
    /**
     * @example 10000009000001811659604036991910
     *
     * @var string
     */
    public $contentId;

    // 资产凭证的类型，可支持：FILE(文件)、TEXT(文本)、JSON_TEXT(JSON文本)
    /**
     * @example TEXT
     *
     * @var string
     */
    public $contentType;

    // 资产凭证名称
    /**
     * @example 凭证材料001
     *
     * @var string
     */
    public $creditName;

    // 凭证文件下载链接
    /**
     * @example https://xxxx.com/xxx.pdf
     *
     * @var string
     */
    public $creditFileUrl;

    // 上传的文本内容
    /**
     * @example {"内容:"文本文本文本"}
     *
     * @var string
     */
    public $creditContent;

    // 凭证创建时间(yyyy-MM-dd HH:mm:ss)
    /**
     * @example 2018-10-10 10:10:00
     *
     * @var string
     */
    public $createTime;
    protected $_name = [
        'contentId'     => 'content_id',
        'contentType'   => 'content_type',
        'creditName'    => 'credit_name',
        'creditFileUrl' => 'credit_file_url',
        'creditContent' => 'credit_content',
        'createTime'    => 'create_time',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->contentId) {
            $res['content_id'] = $this->contentId;
        }
        if (null !== $this->contentType) {
            $res['content_type'] = $this->contentType;
        }
        if (null !== $this->creditName) {
            $res['credit_name'] = $this->creditName;
        }
        if (null !== $this->creditFileUrl) {
            $res['credit_file_url'] = $this->creditFileUrl;
        }
        if (null !== $this->creditContent) {
            $res['credit_content'] = $this->creditContent;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InnerCreditInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['content_id'])) {
            $model->contentId = $map['content_id'];
        }
        if (isset($map['content_type'])) {
            $model->contentType = $map['content_type'];
        }
        if (isset($map['credit_name'])) {
            $model->creditName = $map['credit_name'];
        }
        if (isset($map['credit_file_url'])) {
            $model->creditFileUrl = $map['credit_file_url'];
        }
        if (isset($map['credit_content'])) {
            $model->creditContent = $map['credit_content'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }

        return $model;
    }
}
