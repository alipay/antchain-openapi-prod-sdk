<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPCodeScannedInfo extends Model
{
    // 正版码ID
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $ipCode;

    // 正版码所在批次已申请的正版码总数
    /**
     * @example 1000
     *
     * @var int
     */
    public $batchUsedCount;

    // 用户的ID
    /**
     * @example 2d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $userId;

    // 用户的名称
    /**
     * @example 张三
     *
     * @var string
     */
    public $userName;

    // 用户头像地址
    /**
     * @example 用户头像地址
     *
     * @var string
     */
    public $avatar;

    // 用户的手机号
    /**
     * @example 13291887615
     *
     * @var string
     */
    public $phoneNumber;

    // 用户的位置信息
    /**
     * @example 浙江省杭州市西湖区
     *
     * @var string
     */
    public $gps;

    // 领取正版码的交易哈希
    /**
     * @example 交易哈希
     *
     * @var string
     */
    public $hash;

    // 领取正版码交易所在的区块高度
    /**
     * @example 1234567
     *
     * @var int
     */
    public $blockNumber;

    // 处理时间(毫秒时间戳)
    /**
     * @example 713471745
     *
     * @var int
     */
    public $timestamp;

    // IP ID
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb167354725347
     *
     * @var string
     */
    public $ipId;

    // 订单ID
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb1653461535297423
     *
     * @var string
     */
    public $orderId;

    // 正版码商品信息配置列表
    /**
     * @example
     *
     * @var IPCodeGoodsInfo[]
     */
    public $goodsInfoList;

    // 正版码资源位配置信息列表
    /**
     * @example
     *
     * @var IPCodeAdvertisingInfo[]
     */
    public $adInfoList;

    // ip版权方信息
    /**
     * @example
     *
     * @var IPCodeIpOwnerInfo
     */
    public $ipownerInfo;

    // 0:未配置, 1:配置成功可展示, 4:已经失效, 9:下架【本期不实现】
    /**
     * @example
     *
     * @var int
     */
    public $ipCodeStatus;

    // 额外功能，包括是否允许收藏等
    /**
     * @example
     *
     * @var int[]
     */
    public $features;

    // 核验次数，配置生效后的核验次数统计
    /**
     * @example 15
     *
     * @var int
     */
    public $checkCounts;

    // 正版码关联的I IP信息
    /**
     * @example
     *
     * @var IPCodeIpGoodInfo
     */
    public $ipInfo;

    // UNI码
    /**
     * @example UNI23678678
     *
     * @var string
     */
    public $uniCode;

    // 正版码配置附加信息，信息内容由调用方自定义
    /**
     * @example 附加信息
     *
     * @var string
     */
    public $extInfo;

    // 收藏时间(UNIX时间戳)0表示未被收藏
    /**
     * @example 14917547571
     *
     * @var int
     */
    public $receiveTime;

    // 同一批次存在失效UNI码的场景下,指示更新后的下标
    /**
     * @example 1
     *
     * @var int
     */
    public $fixedIndex;

    // 同一批次存在失效UNI码的场景下,指示更新后的总量
    /**
     * @example 99
     *
     * @var int
     */
    public $fixedCount;

    // 小龙坎有限公司
    /**
     * @example 商家名称
     *
     * @var string
     */
    public $accountExternalName;

    // 码失效时间（毫秒时间戳）
    /**
     * @example
     *
     * @var int
     */
    public $disabledDate;
    protected $_name = [
        'ipCode'              => 'ip_code',
        'batchUsedCount'      => 'batch_used_count',
        'userId'              => 'user_id',
        'userName'            => 'user_name',
        'avatar'              => 'avatar',
        'phoneNumber'         => 'phone_number',
        'gps'                 => 'gps',
        'hash'                => 'hash',
        'blockNumber'         => 'block_number',
        'timestamp'           => 'timestamp',
        'ipId'                => 'ip_id',
        'orderId'             => 'order_id',
        'goodsInfoList'       => 'goods_info_list',
        'adInfoList'          => 'ad_info_list',
        'ipownerInfo'         => 'ipowner_info',
        'ipCodeStatus'        => 'ip_code_status',
        'features'            => 'features',
        'checkCounts'         => 'check_counts',
        'ipInfo'              => 'ip_info',
        'uniCode'             => 'uni_code',
        'extInfo'             => 'ext_info',
        'receiveTime'         => 'receive_time',
        'fixedIndex'          => 'fixed_index',
        'fixedCount'          => 'fixed_count',
        'accountExternalName' => 'account_external_name',
        'disabledDate'        => 'disabled_date',
    ];

    public function validate()
    {
        Model::validateRequired('ipCode', $this->ipCode, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('userName', $this->userName, true);
        Model::validateRequired('avatar', $this->avatar, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
        Model::validateRequired('ipId', $this->ipId, true);
        Model::validateRequired('orderId', $this->orderId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ipCode) {
            $res['ip_code'] = $this->ipCode;
        }
        if (null !== $this->batchUsedCount) {
            $res['batch_used_count'] = $this->batchUsedCount;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->avatar) {
            $res['avatar'] = $this->avatar;
        }
        if (null !== $this->phoneNumber) {
            $res['phone_number'] = $this->phoneNumber;
        }
        if (null !== $this->gps) {
            $res['gps'] = $this->gps;
        }
        if (null !== $this->hash) {
            $res['hash'] = $this->hash;
        }
        if (null !== $this->blockNumber) {
            $res['block_number'] = $this->blockNumber;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->ipId) {
            $res['ip_id'] = $this->ipId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->goodsInfoList) {
            $res['goods_info_list'] = [];
            if (null !== $this->goodsInfoList && \is_array($this->goodsInfoList)) {
                $n = 0;
                foreach ($this->goodsInfoList as $item) {
                    $res['goods_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->adInfoList) {
            $res['ad_info_list'] = [];
            if (null !== $this->adInfoList && \is_array($this->adInfoList)) {
                $n = 0;
                foreach ($this->adInfoList as $item) {
                    $res['ad_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->ipownerInfo) {
            $res['ipowner_info'] = null !== $this->ipownerInfo ? $this->ipownerInfo->toMap() : null;
        }
        if (null !== $this->ipCodeStatus) {
            $res['ip_code_status'] = $this->ipCodeStatus;
        }
        if (null !== $this->features) {
            $res['features'] = $this->features;
        }
        if (null !== $this->checkCounts) {
            $res['check_counts'] = $this->checkCounts;
        }
        if (null !== $this->ipInfo) {
            $res['ip_info'] = null !== $this->ipInfo ? $this->ipInfo->toMap() : null;
        }
        if (null !== $this->uniCode) {
            $res['uni_code'] = $this->uniCode;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        if (null !== $this->receiveTime) {
            $res['receive_time'] = $this->receiveTime;
        }
        if (null !== $this->fixedIndex) {
            $res['fixed_index'] = $this->fixedIndex;
        }
        if (null !== $this->fixedCount) {
            $res['fixed_count'] = $this->fixedCount;
        }
        if (null !== $this->accountExternalName) {
            $res['account_external_name'] = $this->accountExternalName;
        }
        if (null !== $this->disabledDate) {
            $res['disabled_date'] = $this->disabledDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPCodeScannedInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ip_code'])) {
            $model->ipCode = $map['ip_code'];
        }
        if (isset($map['batch_used_count'])) {
            $model->batchUsedCount = $map['batch_used_count'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['avatar'])) {
            $model->avatar = $map['avatar'];
        }
        if (isset($map['phone_number'])) {
            $model->phoneNumber = $map['phone_number'];
        }
        if (isset($map['gps'])) {
            $model->gps = $map['gps'];
        }
        if (isset($map['hash'])) {
            $model->hash = $map['hash'];
        }
        if (isset($map['block_number'])) {
            $model->blockNumber = $map['block_number'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['ip_id'])) {
            $model->ipId = $map['ip_id'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['goods_info_list'])) {
            if (!empty($map['goods_info_list'])) {
                $model->goodsInfoList = [];
                $n                    = 0;
                foreach ($map['goods_info_list'] as $item) {
                    $model->goodsInfoList[$n++] = null !== $item ? IPCodeGoodsInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['ad_info_list'])) {
            if (!empty($map['ad_info_list'])) {
                $model->adInfoList = [];
                $n                 = 0;
                foreach ($map['ad_info_list'] as $item) {
                    $model->adInfoList[$n++] = null !== $item ? IPCodeAdvertisingInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['ipowner_info'])) {
            $model->ipownerInfo = IPCodeIpOwnerInfo::fromMap($map['ipowner_info']);
        }
        if (isset($map['ip_code_status'])) {
            $model->ipCodeStatus = $map['ip_code_status'];
        }
        if (isset($map['features'])) {
            if (!empty($map['features'])) {
                $model->features = $map['features'];
            }
        }
        if (isset($map['check_counts'])) {
            $model->checkCounts = $map['check_counts'];
        }
        if (isset($map['ip_info'])) {
            $model->ipInfo = IPCodeIpGoodInfo::fromMap($map['ip_info']);
        }
        if (isset($map['uni_code'])) {
            $model->uniCode = $map['uni_code'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }
        if (isset($map['receive_time'])) {
            $model->receiveTime = $map['receive_time'];
        }
        if (isset($map['fixed_index'])) {
            $model->fixedIndex = $map['fixed_index'];
        }
        if (isset($map['fixed_count'])) {
            $model->fixedCount = $map['fixed_count'];
        }
        if (isset($map['account_external_name'])) {
            $model->accountExternalName = $map['account_external_name'];
        }
        if (isset($map['disabled_date'])) {
            $model->disabledDate = $map['disabled_date'];
        }

        return $model;
    }
}
