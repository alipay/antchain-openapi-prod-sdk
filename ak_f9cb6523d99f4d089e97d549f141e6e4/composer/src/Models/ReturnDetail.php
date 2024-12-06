<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_f9cb6523d99f4d089e97d549f141e6e4\Models;

use AlibabaCloud\Tea\Model;

class ReturnDetail extends Model
{
    // 结果对象内容
    /**
     * @example {}
     *
     * @var string
     */
    public $bizContent;

    // 返回形式
    /**
     * @example BIZCONTENT 字段返回格式化,这种模式下取bizContent字段 FILE 文件模式，这种模式下用fileUrls获取文件
     *
     * @var string
     */
    public $returnType;

    // 文件列表
    /**
     * @example ["a.com","b.com"]
     *
     * @var string[]
     */
    public $fileUrls;

    // 文件类型
    /**
     * @example  PDF pdf TXT JSON结构化
     *
     * @var string
     */
    public $fileType;

    // 加密模式
    /**
     * @example LINKS：链接加密 CONTENT：内容加密，使用信封模式，
     *
     * @var string
     */
    public $encryptModel;

    // 密钥信封
    /**
     * @example 密钥信封，用RSA将将对内容处理的对称钥加密
     *
     * @var string
     */
    public $secretEnvelope;
    protected $_name = [
        'bizContent'     => 'biz_content',
        'returnType'     => 'return_type',
        'fileUrls'       => 'file_urls',
        'fileType'       => 'file_type',
        'encryptModel'   => 'encrypt_model',
        'secretEnvelope' => 'secret_envelope',
    ];

    public function validate()
    {
        Model::validateRequired('bizContent', $this->bizContent, true);
        Model::validateRequired('returnType', $this->returnType, true);
        Model::validateRequired('fileUrls', $this->fileUrls, true);
        Model::validateRequired('fileType', $this->fileType, true);
        Model::validateRequired('encryptModel', $this->encryptModel, true);
        Model::validateRequired('secretEnvelope', $this->secretEnvelope, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizContent) {
            $res['biz_content'] = $this->bizContent;
        }
        if (null !== $this->returnType) {
            $res['return_type'] = $this->returnType;
        }
        if (null !== $this->fileUrls) {
            $res['file_urls'] = $this->fileUrls;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->encryptModel) {
            $res['encrypt_model'] = $this->encryptModel;
        }
        if (null !== $this->secretEnvelope) {
            $res['secret_envelope'] = $this->secretEnvelope;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReturnDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_content'])) {
            $model->bizContent = $map['biz_content'];
        }
        if (isset($map['return_type'])) {
            $model->returnType = $map['return_type'];
        }
        if (isset($map['file_urls'])) {
            if (!empty($map['file_urls'])) {
                $model->fileUrls = $map['file_urls'];
            }
        }
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }
        if (isset($map['encrypt_model'])) {
            $model->encryptModel = $map['encrypt_model'];
        }
        if (isset($map['secret_envelope'])) {
            $model->secretEnvelope = $map['secret_envelope'];
        }

        return $model;
    }
}
