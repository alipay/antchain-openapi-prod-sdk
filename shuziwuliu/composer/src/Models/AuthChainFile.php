<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class AuthChainFile extends Model
{
    // 签署文件的hash值
    /**
     * @example ca94860b2f902e1ba7917d2c6a983cc43e5b3921f4b7ab28ea791ac28314ba52
     *
     * @var string
     */
    public $signFileHash;

    // 上链事务唯一标识
    /**
     * @example ca94860b2f902e1ba7917d2c6a983cc43e5b3921f4b7ab28ea791ac28314ba52
     *
     * @var string
     */
    public $uploadChainTxCode;

    // 蚂蚁区块链统一证据编号
    /**
     * @example ca94860b2f902e1ba7917d2c6a983cc43e5b3921f4b7ab28ea791ac28314ba52
     *
     * @var string
     */
    public $baasUniqCode;

    // 上链时间(13位毫秒级时间戳)
    /**
     * @example 1628563284015
     *
     * @var string
     */
    public $uploadChainTime;

    // 上链文件下载链接
    /**
     * @example https://pic2.zhimg.com/v2-4d91e54c6cc5d225471684987a2061a1_r.jpg
     *
     * @var string
     */
    public $fileUrl;

    // 上链文件名称，要求包含扩展名。文件格式允许: pdf, txt, doc, docx
    /**
     * @example 上链文件.pdf
     *
     * @var string
     */
    public $fileName;
    protected $_name = [
        'signFileHash'      => 'sign_file_hash',
        'uploadChainTxCode' => 'upload_chain_tx_code',
        'baasUniqCode'      => 'baas_uniq_code',
        'uploadChainTime'   => 'upload_chain_time',
        'fileUrl'           => 'file_url',
        'fileName'          => 'file_name',
    ];

    public function validate()
    {
        Model::validateRequired('signFileHash', $this->signFileHash, true);
        Model::validateRequired('uploadChainTxCode', $this->uploadChainTxCode, true);
        Model::validateRequired('baasUniqCode', $this->baasUniqCode, true);
        Model::validateRequired('uploadChainTime', $this->uploadChainTime, true);
        Model::validateRequired('fileUrl', $this->fileUrl, true);
        Model::validateRequired('fileName', $this->fileName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->signFileHash) {
            $res['sign_file_hash'] = $this->signFileHash;
        }
        if (null !== $this->uploadChainTxCode) {
            $res['upload_chain_tx_code'] = $this->uploadChainTxCode;
        }
        if (null !== $this->baasUniqCode) {
            $res['baas_uniq_code'] = $this->baasUniqCode;
        }
        if (null !== $this->uploadChainTime) {
            $res['upload_chain_time'] = $this->uploadChainTime;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthChainFile
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sign_file_hash'])) {
            $model->signFileHash = $map['sign_file_hash'];
        }
        if (isset($map['upload_chain_tx_code'])) {
            $model->uploadChainTxCode = $map['upload_chain_tx_code'];
        }
        if (isset($map['baas_uniq_code'])) {
            $model->baasUniqCode = $map['baas_uniq_code'];
        }
        if (isset($map['upload_chain_time'])) {
            $model->uploadChainTime = $map['upload_chain_time'];
        }
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }

        return $model;
    }
}
