<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class GetInternalFileResponse extends Model
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

    // 文件存证模式，FILE_RAW(文件原文内容) 和 FILE_HASH(文件hash)
    /**
     * @var string
     */
    public $fileNotaryType;

    // 文件下载地址，当fileNotaryType 为 FILE_RAW 时才有此值，下载链接有效期1个小时
    /**
     * @var string
     */
    public $ossPath;

    // 文件哈希，当 fileNotaryType 为 FILE_HASH 时才有此值
    /**
     * @var string
     */
    public $fileHash;

    // 哈希算法，当 fileNotaryType 为 FILE_HASH 时，此返回值才有效
    /**
     * @var string
     */
    public $hashAlgorithm;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'fileNotaryType' => 'file_notary_type',
        'ossPath'        => 'oss_path',
        'fileHash'       => 'file_hash',
        'hashAlgorithm'  => 'hash_algorithm',
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
        if (null !== $this->fileNotaryType) {
            $res['file_notary_type'] = $this->fileNotaryType;
        }
        if (null !== $this->ossPath) {
            $res['oss_path'] = $this->ossPath;
        }
        if (null !== $this->fileHash) {
            $res['file_hash'] = $this->fileHash;
        }
        if (null !== $this->hashAlgorithm) {
            $res['hash_algorithm'] = $this->hashAlgorithm;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetInternalFileResponse
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
        if (isset($map['file_notary_type'])) {
            $model->fileNotaryType = $map['file_notary_type'];
        }
        if (isset($map['oss_path'])) {
            $model->ossPath = $map['oss_path'];
        }
        if (isset($map['file_hash'])) {
            $model->fileHash = $map['file_hash'];
        }
        if (isset($map['hash_algorithm'])) {
            $model->hashAlgorithm = $map['hash_algorithm'];
        }

        return $model;
    }
}
