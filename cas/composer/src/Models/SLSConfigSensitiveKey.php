<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class SLSConfigSensitiveKey extends Model
{
    // 是否替换该字段中所有的敏感内容。建议设置为true
    /**
     * @example true, false
     *
     * @var bool
     */
    public $all;

    // 当type设置为const时必须填写
    /**
     * @example const
     *
     * @var string
     */
    public $constValue;

    // 日志Key名称
    /**
     * @example key
     *
     * @var string
     */
    public $key;

    // 敏感内容的前缀
    /**
     * @example regex_begin
     *
     * @var string
     */
    public $regexBegin;

    // 敏感内容正则表达式。
    /**
     * @example regex_content
     *
     * @var string
     */
    public $regexContent;

    // 脱敏方式，取值为const、md5。
    // 若取值为const，则将敏感内容替换成const字段取值内容。
    // 若取值为md5，则将敏感内容替换为其对应的MD5值。
    /**
     * @example const、md5
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'all'          => 'all',
        'constValue'   => 'const_value',
        'key'          => 'key',
        'regexBegin'   => 'regex_begin',
        'regexContent' => 'regex_content',
        'type'         => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('all', $this->all, true);
        Model::validateRequired('key', $this->key, true);
        Model::validateRequired('regexBegin', $this->regexBegin, true);
        Model::validateRequired('regexContent', $this->regexContent, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->all) {
            $res['all'] = $this->all;
        }
        if (null !== $this->constValue) {
            $res['const_value'] = $this->constValue;
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->regexBegin) {
            $res['regex_begin'] = $this->regexBegin;
        }
        if (null !== $this->regexContent) {
            $res['regex_content'] = $this->regexContent;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SLSConfigSensitiveKey
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['all'])) {
            $model->all = $map['all'];
        }
        if (isset($map['const_value'])) {
            $model->constValue = $map['const_value'];
        }
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['regex_begin'])) {
            $model->regexBegin = $map['regex_begin'];
        }
        if (isset($map['regex_content'])) {
            $model->regexContent = $map['regex_content'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
